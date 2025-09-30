package com.example.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category_23162035 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @SuppressWarnings("unused")
    private String name;
    public void setName(String name2) {
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}