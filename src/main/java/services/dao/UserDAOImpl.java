package services.dao;

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAOImpl {
    public static void addUser(User user) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myschema");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//
//        entityManager.persist(user);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();

    }

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("mamuka");
        user.setLastName("srsrs");
        user.setEmail("asdasd");
        user.setPassword("xzczc");
        user.setPhoneNumber("zxczxc");
        user.setAddress("zxczxc");
        addUser(user);
    }
//
//    @Override
//    public void getUsers() {
//
//    }
}
