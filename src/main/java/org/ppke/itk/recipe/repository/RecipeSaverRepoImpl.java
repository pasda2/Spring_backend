package org.ppke.itk.recipe.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.ppke.itk.recipe.domain.Favorites;
import org.ppke.itk.recipe.domain.Ingredients;
import org.ppke.itk.recipe.domain.Recipe;
import org.ppke.itk.recipe.domain.Steps;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RecipeSaverRepoImpl implements RecipeSaverRepo {
    @PersistenceContext
    private final EntityManager entityManager;
    private final StepsRepo stepsRepo;
    private final RecipeDetailsRepo recipeDetailsRepo;

    @Override
    @Transactional
    public Recipe saveRecipe(Recipe recipe) {
        entityManager.persist(recipe);
        entityManager.flush();
        return recipe;
    }

    @Transactional
    public Favorites saveFavorites(Favorites favorites) {
        entityManager.persist(favorites);
        return favorites;
    }

    @Transactional
    public void deleteFavorites(Favorites favorites) {
        entityManager.remove(favorites);
    }

}
