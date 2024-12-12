package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.RecipeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RecipeDetailsRepo extends JpaRepository<RecipeDetails, Integer> {
    Optional<RecipeDetails> findById(Integer id);
    List<RecipeDetails> findAll();

    //void deleteById(Integer id);
}
