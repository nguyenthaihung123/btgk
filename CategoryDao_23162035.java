package com.example.app.dao;


import com.example.app.entity.Category_23162035;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class CategoryDao_23162035 {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    public void save(Category_23162035 c) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }
    public void update(Category_23162035 c) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        em.close();
    }
    public void delete(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Category_23162035 c = em.find(Category_23162035.class, id);
        if (c != null) em.remove(c);
        em.getTransaction().commit();
        em.close();
    }
    public Category_23162035 find(Long id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Category_23162035.class, id);
    }
    public List<Category_23162035> findAll(int page, int size) {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT c FROM Category c", Category_23162035.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }
    public long count() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT COUNT(c) FROM Category c", Long.class).getSingleResult();
    }
}

