package com.brunaluni.greenheart.GreenHeart.repository;

import com.brunaluni.greenheart.GreenHeart.model.Category;
import com.brunaluni.greenheart.GreenHeart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
