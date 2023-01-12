package com.brunaluni.greenheart.GreenHeart.repository;

import com.brunaluni.greenheart.GreenHeart.model.Category;
import com.brunaluni.greenheart.GreenHeart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
