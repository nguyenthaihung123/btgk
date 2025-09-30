package com.example.app.controller;

import java.io.IOException;
import com.example.app.service.AuthService_23162035;
import com.example.app.entity.User_23162035;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet_23162035 extends HttpServlet {
    private AuthService_23162035 authService = new AuthService_23162035();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User_23162035 user = (User_23162035) authService.login(username, password);
        if (user != null) {
            req.getSession().setAttribute("user", user);
            try {
                if ("ADMIN".equals(((User_23162035) user).getRole())) {
                    resp.sendRedirect("admin/home.jsp");
                } 
                else {
                    resp.sendRedirect("index.jsp");
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        } 
        else {
            req.setAttribute("error", "Sai tài khoản hoặc mật khẩu!");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
