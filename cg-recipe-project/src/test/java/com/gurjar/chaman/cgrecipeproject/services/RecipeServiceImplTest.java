package com.gurjar.chaman.cgrecipeproject.services;

import com.gurjar.chaman.cgrecipeproject.model.Recipe;
import com.gurjar.chaman.cgrecipeproject.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 20-Aug-2020
 */

class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }


    @Test
    void getRecipes() {
        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 0);
        Mockito.verify(recipeRepository, Mockito.times(1)).findAll();  // Checking is repository called only once.
    }
}