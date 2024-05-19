package com.xworkz.respository;

import com.xworkz.dto.Customer;
import com.xworkz.dto.CustomerLogin;
import com.xworkz.util.EMFUtil;

import javax.persistence.EntityManager;

public class CustomerLoginRepositoryImpl implements CustomerLoginRepository{
    @Override
    public void save(CustomerLogin customerLogin) {
        EntityManager entityManager= EMFUtil.getEntityManager();

        try {

            entityManager.getTransaction().begin();

            entityManager.persist(customerLogin);

            entityManager.getTransaction().commit();

            System.out.println("Storing the customer login credentials data in database is successfully");

        }catch (Exception e){
            System.out.println("Exception while saving data in customer login credentials.."+ e);
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
        }

    }
}
