package org.xworkz.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
    static EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz");
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }

    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }
}
