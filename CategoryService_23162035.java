package com.example.app.service;

import com.example.app.dao.CategoryDao_23162035;

import com.example.app.entity.Category_23162035;

import java.util.List;

public class CategoryService_23162035 {
    private CategoryDao_23162035 dao = new CategoryDao_23162035();
    /**
     * @param c
     */
    public void save(Category_23162035 c) { 
        dao.save(c); 
    }
    public void update(Category_23162035 c) { 
        dao.update(c); 
    }
    public void delete(Long id) { 
        dao.delete(id); 
    }
    public Category_23162035 find(Long id) { 
        return dao.find(id); 
    }
    public List<Category_23162035> findAll(int page, int size) { 
        return dao.findAll(page, size); 
    }
    public long count() { 
        return dao.count(); 
    }
}

