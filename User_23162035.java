package com.example.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User_23162035 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @SuppressWarnings("unused")
    private String username;
    @SuppressWarnings("unused")
    private String password;
    @SuppressWarnings("unused")
    private String role;
    public void setPassword(String newPass) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPassword'");
    }
    public void setUsername(String username2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUsername'");
    } 
}