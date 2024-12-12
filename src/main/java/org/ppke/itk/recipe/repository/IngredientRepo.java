package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepo extends JpaRepository<Ingredients, Integer> {
    List<Ingredients> findAll();

}
