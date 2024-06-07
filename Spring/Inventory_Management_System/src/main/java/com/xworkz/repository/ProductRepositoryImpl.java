package com.xworkz.repository;

import com.xworkz.dto.ProductDto;
import com.xworkz.requestDto.RequestProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository{



    @Autowired
    private EntityManagerFactory entityManagerFactory;


    @Override
    public boolean save(ProductDto productDto) {
        System.out.println("Repository saving process is initiated.");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(productDto);
            transaction.commit();
            return true;

        }catch(PersistenceException e){
            e.printStackTrace();
            transaction.rollback();
        }

        finally {
            entityManager.close();
        }

        return false;
    }

    @Override
    public Optional<ProductDto> findById(int id) {
        System.out.println("Repository find process is initiated.");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        try {
            Query query= entityManager.createNamedQuery("findById");
            query.setParameter("productId", (long) id);
            ProductDto productDto = (ProductDto) query.getSingleResult();
            return Optional.ofNullable(productDto);

        }catch(PersistenceException e){
            e.printStackTrace();
            transaction.rollback();
        }

        finally {
            entityManager.close();
        }

       return Optional.empty();

    }


    @Override
    public Optional<List<ProductDto>> findByCurentStock(int currentStock){
        System.out.println("Repository find process is initiated using current stock data."+ currentStock);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        try {
            Query query= entityManager.createNamedQuery("findByCurentStock");
            query.setParameter("currentStock", currentStock);
            List<ProductDto> productDtoList = (List<ProductDto>) query.getResultList();

            System.out.println(productDtoList);
            return Optional.ofNullable(productDtoList);

        }catch(PersistenceException e){
            e.printStackTrace();
            transaction.rollback();
        }

        finally {
            entityManager.close();
        }




        return Optional.empty();
    }
}
