package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.AvailableIngredients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvailableIngredientsRepo extends JpaRepository<AvailableIngredients, Integer> {
    List<AvailableIngredients> findAll();
}
