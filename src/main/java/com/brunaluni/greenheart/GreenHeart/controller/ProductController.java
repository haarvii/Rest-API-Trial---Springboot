package com.brunaluni.greenheart.GreenHeart.controller;

import com.brunaluni.greenheart.GreenHeart.exception.CategoryNotFoundException;
import com.brunaluni.greenheart.GreenHeart.exception.ProductNotFoundException;
import com.brunaluni.greenheart.GreenHeart.model.Category;
import com.brunaluni.greenheart.GreenHeart.model.Product;
import com.brunaluni.greenheart.GreenHeart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    Product newUser(@RequestBody Product newCategory) {
        return productRepository.save(newCategory);
    }

    @GetMapping("/products")
    List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PutMapping("/product/{id}")
    Product updateProduct(@RequestBody Product newCategory, @PathVariable Long id) {
        return productRepository.findById(id).map(
                cat -> {

                    cat.setProductName(newCategory.getProductName());
                    cat.setProductDescription(newCategory.getProductDescription());
                    cat.setProductImage(newCategory.getProductImage());
                    cat.setProductSize(newCategory.getProductSize());
                    cat.setProductColor(newCategory.getProductColor());
                    cat.setAvailibility(newCategory.getAvailibility());
                    cat.setCategoryName(newCategory.getCategoryName());

                    return productRepository.save(cat);
                }).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @DeleteMapping("product/{id}")
    String deleteProduct(@PathVariable Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotFoundException(id);
        }
        productRepository.deleteById(id);

        return "Product has been deleted with id : " + id + " successfully";
    }


}
