package com.xworkz.respository;

import com.xworkz.dto.Customer;
import com.xworkz.util.EMFUtil;

import javax.persistence.EntityManager;

public class CustomerRepositoryImpl implements CustomerRepository{

    @Override
    public Customer save(Customer customer) {
        EntityManager entityManager= EMFUtil.getEntityManager();
        Customer customer1;

        try {

            entityManager.getTransaction().begin();

            entityManager.persist(customer);

            customer1 = entityManager.find(Customer.class, customer);

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
}
