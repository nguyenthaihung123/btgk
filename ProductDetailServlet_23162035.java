package com.example.app.controller;

import java.io.IOException;

import com.example.app.dao.ProductDAO_23162035;
import com.example.app.entity.Product_23162035;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/product-detail")
public class ProductDetailServlet_23162035 extends HttpServlet {
    private ProductDAO_23162035 productDAO = new ProductDAO_23162035();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product_23162035 product = productDAO.getProductById(id);
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/product-detail.jsp");
        dispatcher.forward(request, response);
    }
}

