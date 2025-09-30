package com.example.app.controller;

import com.example.app.dao.ProductDAO_23162035;
import com.example.app.entity.Product_23162035;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    private ProductDAO_23162035 productDAO = new ProductDAO_23162035();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product_23162035> products = productDAO.getAllProducts();
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/product-list.jsp");
        dispatcher.forward(request, response);
    }
}
