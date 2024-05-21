package com.xworkz.respository;

import com.xworkz.dto.Customer;
import com.xworkz.util.EMFUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CustomerRepositoryImpl implements CustomerRepository{

    @Override
    public Customer save(Customer customer) {
        System.out.println("inside repository "+customer);
        EntityManager entityManager= EMFUtil.getEntityManager();

        try {

            entityManager.getTransaction().begin();

            entityManager.persist(customer);

            entityManager.getTransaction().commit();

            System.out.println("Storing the customer data in database is successfully");

        }catch (Exception e){
            System.out.println("Exception while saving data in customer.."+ e);
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
        }

        return customer;

    }

    @Override
    public Customer find(Customer customer) {
        System.out.println("fetching the data from the customer...");

        System.out.println("inside repository "+customer);
        EntityManager entityManager= EMFUtil.getEntityManager();
        Customer customer1 = null;

        try {

//            entityManager.getTransaction().begin();

            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
            Root<Customer> from = criteriaQuery.from(Customer.class);

            CriteriaQuery<Customer> select = criteriaQuery.select(from).
                    where(criteriaBuilder.and(
                                criteriaBuilder.equal(from.get("name"),customer.getName()),
                                criteriaBuilder.equal(from.get("age"),customer.getAge()),
                                criteriaBuilder.equal(from.get("gender"), customer.getGender()),
                                criteriaBuilder.equal(from.get("dob"), customer.getDob()),
                                criteriaBuilder.equal(from.get("address"), customer.getAddress()),
                                criteriaBuilder.equal(from.get("phone"), customer.getPhone()),
                                criteriaBuilder.equal(from.get("adhar"), customer.getAdhar()),
                                criteriaBuilder.equal(from.get("emergencyContact"), customer.getEmergencyContact())
                            ));


            Query query = entityManager.createQuery(select);
            customer1 = (Customer) query.getSingleResult();

//            entityManager.detach(customer1);
//            entityManager.getTransaction().commit();

        }catch (Exception e){
            System.out.println("Exception while fetching data from customer.."+ e);
            e.printStackTrace();
        }

        finally {
            entityManager.close();
        }

        return customer1;
    }
}
