package com.example.app.controller;

import com.example.app.entity.Category_23162035;
import com.example.app.service.CategoryService_23162035;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/categories")
public class CategoryServlet_23162035 extends HttpServlet {
    private CategoryService_23162035 service = new CategoryService_23162035();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) action = "list";
        switch (action) {
            case "new":
                req.getRequestDispatcher("/WEB-INF/views/category-form.jsp").forward(req, resp);
                break;
            case "edit":
                Long id = Long.parseLong(req.getParameter("id"));
                Category_23162035 c = service.find(id);
                req.setAttribute("category", c);
                req.getRequestDispatcher("/WEB-INF/views/category-form.jsp").forward(req, resp);
                break;
            case "delete":
                service.delete(Long.parseLong(req.getParameter("id")));
                resp.sendRedirect("categories");
                break;
            default: 
                int page = req.getParameter("page") != null ? Integer.parseInt(req.getParameter("page")) : 1;
                int size = 5; 
                List<Category_23162035> list = service.findAll(page, size);
                long total = service.count();
                long totalPages = (long) Math.ceil((double) total / size);
                req.setAttribute("list", list);
                req.setAttribute("page", page);
                req.setAttribute("totalPages", totalPages);
                req.getRequestDispatcher("/WEB-INF/views/category-list.jsp").forward(req, resp);
                break;
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");
        String name = req.getParameter("name");
        Category_23162035 c;
        if (idStr == null || idStr.isEmpty()) {
            c = new Category_23162035();
        } 
        else {
            c = service.find(Long.parseLong(idStr));
        }
        c.setName(name);
        if (idStr == null || idStr.isEmpty()) {
            service.save(c);
        } 
        else {
            service.update(c);
        }
        resp.sendRedirect("categories");
    }
}
