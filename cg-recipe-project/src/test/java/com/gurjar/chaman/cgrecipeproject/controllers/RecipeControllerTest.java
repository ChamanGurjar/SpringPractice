package com.gurjar.chaman.cgrecipeproject.controllers;

import com.gurjar.chaman.cgrecipeproject.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 20-Aug-2020
 */

class RecipeControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    RecipeController recipeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        recipeController = new RecipeController(recipeService);
    }

    @Test
    void getAllRecipes() {
        String allRecipesViewName = recipeController.getAllRecipes(model);
        assertEquals("recipe", allRecipesViewName);
        Mockito.verify(recipeService, Mockito.times(1)).getRecipes();
        Mockito.verify(model, Mockito.times(1)).addAttribute(eq("recipes"), anySet());
    }
}