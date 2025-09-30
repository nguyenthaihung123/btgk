package com.example.app.dao;

import com.example.app.entity.Product_23162035;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ProductDAO_23162035 {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public List<Product_23162035> getAllProducts() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT p FROM Product p", Product_23162035.class).getResultList();
    }
    public Product_23162035 getProductById(int id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Product_23162035.class, id);
    }
}
