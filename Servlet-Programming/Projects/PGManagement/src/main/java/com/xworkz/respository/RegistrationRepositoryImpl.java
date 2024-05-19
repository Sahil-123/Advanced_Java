package com.xworkz.respository;

import com.xworkz.dto.Customer;
import com.xworkz.dto.CustomerLogin;
import com.xworkz.util.EMFUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class RegistrationRepositoryImpl implements RegistrationRepository{
    @Override
    public void register(Customer customer, CustomerLogin customerLogin) {
//        EntityManager entityManager= EMFUtil.getEntityManager();

        EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Customer customer1;

        try {

            entityManager.getTransaction().begin();

            entityManager.persist(customer);

            customer1 = entityManager.find(Customer.class, customer);

            customerLogin.setCustomerId(customer1.getCustomerId());

            entityManager.persist(customerLogin);

            entityManager.getTransaction().commit();

            System.out.println("Storing the customer data in database is successfully");

        }catch (Exception e){
            System.out.println("Exception while saving data in customer.."+ e);
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
        }

    }
}
