package com.example.app.dao;

import com.example.app.entity.User_23162035;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class UserDao_23162035 {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    public void save(User_23162035 u) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
    }
    public User_23162035 findByUsername(String username) {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT u FROM User u WHERE u.username = :u", User_23162035.class)
                .setParameter("u", username)
                .getResultStream().findFirst().orElse(null);
    }
    public List<User_23162035> findAll(int page, int size) {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT u FROM User u", User_23162035.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }
    public static void update(User_23162035 user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
