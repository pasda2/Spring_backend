package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.Favorites;
import org.ppke.itk.recipe.domain.Recipe;

public interface RecipeSaverRepo {
    Recipe saveRecipe(Recipe recipe);
    Favorites saveFavorites(Favorites favorites);
    void deleteFavorites(Favorites favorites);
}
