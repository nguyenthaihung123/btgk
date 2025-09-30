package com.example.app.controller;

import com.example.app.entity.User_23162035;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet_23162035 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            User_23162035 newUser = new User_23162035();
            newUser.setUsername(username);
            newUser.setPassword(password);
            em.persist(newUser);
            em.getTransaction().commit();
            response.sendRedirect("login.jsp");
        } 
        finally {
            em.close();
            emf.close();
        }
    }
}
