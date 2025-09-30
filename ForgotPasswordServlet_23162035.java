package com.example.app.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import com.example.app.entity.User_23162035;
import com.example.app.dao.UserDao_23162035;
@WebServlet("/forgot")
public class ForgotPasswordServlet_23162035 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.getRequestDispatcher("forgot.jsp").forward(request, response);
    }
    @SuppressWarnings("unused")
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String newPass = request.getParameter("password");
        String confirm = request.getParameter("confirm");
        if (!newPass.equals(confirm)) {
            request.setAttribute("msg", "Mật khẩu xác nhận không khớp!");
            request.getRequestDispatcher("forgot.jsp").forward(request, response);
            return;
        }
        @SuppressWarnings("unused")
        UserDao_23162035 userDao = new UserDao_23162035(); 
        User_23162035 user = new User_23162035();
        if (user != null) {
            user.setPassword(newPass);
            UserDao_23162035.update(user);
            request.setAttribute("msg", "Đổi mật khẩu thành công, vui lòng đăng nhập lại!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } 
        else {
            request.setAttribute("msg", "Tên đăng nhập không tồn tại!");
            request.getRequestDispatcher("forgot.jsp").forward(request, response);
        }
    }
}
