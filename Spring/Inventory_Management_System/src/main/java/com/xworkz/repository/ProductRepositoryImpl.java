package com.xworkz.repository;

import com.xworkz.dto.ProductDto;
import com.xworkz.requestDto.RequestProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
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
}
