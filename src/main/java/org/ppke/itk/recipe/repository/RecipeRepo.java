package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RecipeRepo extends JpaRepository<Recipe, Integer> {
    Optional<Recipe> findById(Integer id);
    List<Recipe> findAll();
    //Optional<Recipe> findByName(String title);

}
