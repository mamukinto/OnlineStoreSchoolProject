package services.dao;

import model.Computer;
import model.Phone;
import model.TV;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {
    @Override
    public void addPhone(Phone phone) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("myschema");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(phone);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void addTV(TV tv) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("myschema");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(tv);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void addComputer(Computer computer) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("myschema");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(computer);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public List<Phone> getPhones() {
        return null;
    }

    @Override
    public List<TV> getTV() {
        return null;
    }

    @Override
    public List<Computer> getComputer() {
        return null;
    }
}
