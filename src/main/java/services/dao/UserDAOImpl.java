package services.dao;

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAOImpl implements UserDAO{
    public void addUser(User user) {
        System.out.println("lol1?");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myschema");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(user);
        entityManager.getTransaction().commit();
        System.out.println("lol2?");
        entityManager.close();
        entityManagerFactory.close();

    }

    @Override
    public void getUsers() {

    }


}
