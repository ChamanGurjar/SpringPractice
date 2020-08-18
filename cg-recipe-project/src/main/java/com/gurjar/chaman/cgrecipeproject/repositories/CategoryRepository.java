package com.gurjar.chaman.cgrecipeproject.repositories;

import com.gurjar.chaman.cgrecipeproject.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 18-Aug-2020
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
