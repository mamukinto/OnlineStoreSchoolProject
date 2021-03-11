package services.dao;

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser(User user) {
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
