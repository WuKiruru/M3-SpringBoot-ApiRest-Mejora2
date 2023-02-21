package com.villoldo.api.servicio;

import com.villoldo.api.model.Category;
import com.villoldo.api.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
    
    public List<Category>listCategories() {
        return repository.findAll();
    }
    
    public void saveCategory(Category Category) {
        repository.save(Category);
    }
    
    public Category obtainCategoryId(Integer id) {
        return repository.findById(id).get();
    }
    
    public void deleteCategory(Integer id) {
        repository.deleteById(id);
    }
    
}
