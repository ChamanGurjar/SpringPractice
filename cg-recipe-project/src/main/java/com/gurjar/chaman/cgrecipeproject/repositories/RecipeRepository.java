package com.gurjar.chaman.cgrecipeproject.repositories;

import com.gurjar.chaman.cgrecipeproject.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 18-Aug-2020
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
