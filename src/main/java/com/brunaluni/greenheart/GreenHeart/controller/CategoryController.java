package com.brunaluni.greenheart.GreenHeart.controller;

import com.brunaluni.greenheart.GreenHeart.exception.CategoryNotFoundException;
import com.brunaluni.greenheart.GreenHeart.exception.UserNotFoundException;
import com.brunaluni.greenheart.GreenHeart.model.Category;
import com.brunaluni.greenheart.GreenHeart.model.User;
import com.brunaluni.greenheart.GreenHeart.repository.CategoryRepository;
import com.brunaluni.greenheart.GreenHeart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping("/category")
    Category newUser(@RequestBody Category newCategory) {
        return categoryRepository.save(newCategory);
    }

    @GetMapping("/categories")
    List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/category/{id}")
    Category getCategoryById(@PathVariable Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException(id));
    }

    @PutMapping("/category/{id}")
    Category updateCategory(@RequestBody Category newCategory, @PathVariable Long id) {
        return categoryRepository.findById(id).map(
                cat -> {
                    cat.setCategoryName(newCategory.getCategoryName());
                    return categoryRepository.save(cat);
                }).orElseThrow(() -> new CategoryNotFoundException(id));
    }

    @DeleteMapping("category/{id}")
    String deleteUser(@PathVariable Long id) {
        if (!categoryRepository.existsById(id)) {
            throw new CategoryNotFoundException(id);
        }
        categoryRepository.deleteById(id);

        return "Category has been deleted with id : " + id + " successfully";
    }

}
