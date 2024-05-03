package org.xworkz.repository;

import org.xworkz.dto.Cartoon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CartoonRepositoryImpl implements CartoonRepository{

    private EntityManager getEnitityManager(){
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
       return entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(Cartoon cartoon) {
        EntityManager entityManager = getEnitityManager();
        entityManager.getTransaction().begin();
        try{
            entityManager.persist(cartoon);
            entityManager.getTransaction().commit();
            System.out.println("saving data completed.");
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            System.out.println("Exception during saving data.."+e);
        }

        finally {
            entityManager.close();
        }
    }

    @Override
    public void delete(int id) {
        EntityManager entityManager = getEnitityManager();
        entityManager.getTransaction().begin();
        try{
            Cartoon cartoon = entityManager.find(Cartoon.class,id);
            entityManager.remove(cartoon);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            System.out.println("Exception during deleting data..");
        }

        finally {
            entityManager.close();
        }
    }

    @Override
    public Cartoon find(int id) {
        EntityManager entityManager = getEnitityManager();
        Cartoon cartoon = null;
        try{
            cartoon = entityManager.find(Cartoon.class,id);
            if(cartoon == null){
                System.out.println("No data found with your specific id:"+id);
            }

        }catch (Exception e){
            System.out.println("Exception during fetching data..");
        }
        finally {
            entityManager.close();
        }

        return cartoon;
    }

    @Override
    public void update(int id, String name) {
        EntityManager entityManager = getEnitityManager();
        entityManager.getTransaction().begin();
        try{
            Cartoon cartoon = entityManager.find(Cartoon.class,id);
            cartoon.setName(name);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            System.out.println("Exception during updating data..");
        }
        finally {
            entityManager.close();
        }
    }

    @Override
    public List<Cartoon> getCartoonByName(String name) {
        EntityManager entityManager = getEnitityManager();
        List<Cartoon> cartoons = null;
        try{
            Query query = entityManager.createNamedQuery("getCartoonByName");
            query.setParameter("name",name);
            cartoons = (List<Cartoon>) query.getResultList();

            if(cartoons == null){
                System.out.println("No data found with your specific Cartoon name : "+ name);
            }

        }catch (Exception e){
            System.out.println("Exception during fetching data..");

        }
        finally {
            entityManager.close();
        }

        return cartoons;
    }

    @Override
    public List<Cartoon> getCartoonByGenderMatches(String pattern) {
        EntityManager entityManager = getEnitityManager();
        List<Cartoon> cartoons = null;
        try{
            Query query = entityManager.createNamedQuery("getCartoonByGenderMatches");
            query.setParameter("gender","%"+pattern+"%");
            cartoons = (List<Cartoon>) query.getResultList();

            if(cartoons == null){
                System.out.println("No data found with your specific given gender pattern : "+ pattern);
            }

        }catch (Exception e){
            System.out.println("Exception during fetching data..");
        }
        finally {
            entityManager.close();
        }

        return cartoons;
    }

    @Override
    public List<Cartoon> getCartoonByTypes(List<String> types) {
        EntityManager entityManager = getEnitityManager();
        List<Cartoon> cartoons = null;
        try{
            Query query = entityManager.createNamedQuery("getCartoonByTypes");
            query.setParameter("types",types);
            cartoons = (List<Cartoon>) query.getResultList();

            if(cartoons == null){
                System.out.println("No data found with your given types : "+ types);
            }

        }catch (Exception e){
            System.out.println("Exception during fetching data..");
        }
        finally {
            entityManager.close();
        }

        return cartoons;
    }
}
