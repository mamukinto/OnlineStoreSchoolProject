package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class userDaoImpl implements userDao{
    @Override
    public void addUsers(User user) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("myschema");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(user);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void getUsers() {

    }
}
