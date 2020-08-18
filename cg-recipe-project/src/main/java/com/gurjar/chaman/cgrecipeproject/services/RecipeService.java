package com.gurjar.chaman.cgrecipeproject.services;

import com.gurjar.chaman.cgrecipeproject.model.Recipe;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 18-Aug-2020
 */

public interface RecipeService {
    Set<Recipe> getRecipes();
}
