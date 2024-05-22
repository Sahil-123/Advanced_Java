package com.xworkz.respository;

import com.xworkz.dto.Customer;
import com.xworkz.dto.CustomerLogin;
import com.xworkz.util.EMFUtil;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Slf4j
public class CustomerRegistrationRepositoryImpl implements CustomerRegistrationRepository {
    @Override
    public void register(Customer customer, CustomerLogin customerLogin) {
        EntityManager entityManager= EMFUtil.getEntityManager();
        log.info("data storing process initiated..");

        try {
            entityManager.getTransaction().begin();

            entityManager.persist(customer);
            Customer customer1 = findCustomer(customer,entityManager);
            customerLogin.setCustomerId(customer1.getCustomerId());
            entityManager.persist(customerLogin);

            entityManager.getTransaction().commit();
            log.info("Storing the customer data in database is successfully");

        }catch (Exception e){
            log.error("Exception while saving data in customer.."+ e);
            entityManager.getTransaction().rollback();
        }
        finally {
            entityManager.close();
        }
    }

    private Customer findCustomer(Customer customer,EntityManager entityManager) throws Exception{
        Customer returnedCustomer = null;

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
        returnedCustomer = (Customer) query.getSingleResult();

        return returnedCustomer;
    }

}
