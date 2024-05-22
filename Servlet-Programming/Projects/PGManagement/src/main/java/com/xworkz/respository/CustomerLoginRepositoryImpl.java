package com.xworkz.respository;

import com.xworkz.dto.Customer;
import com.xworkz.dto.CustomerLogin;
import com.xworkz.util.EMFUtil;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManager;

@Slf4j
public class CustomerLoginRepositoryImpl implements CustomerLoginRepository{
    @Override
    public void save(CustomerLogin customerLogin) {
        log.info("Storing the customer login credentials data in database ....");

        EntityManager entityManager= EMFUtil.getEntityManager();

        try {

            entityManager.getTransaction().begin();

            entityManager.persist(customerLogin);

            entityManager.getTransaction().commit();

           log.info("Storing the customer login credentials data in database is successfully");

        }catch (Exception e){
            log.error("Exception while saving data in customer login credentials.."+ e);
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
        }

    }
}
