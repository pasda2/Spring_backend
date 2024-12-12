package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.Steps;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StepsRepo extends JpaRepository<Steps, Integer> {
    Optional<Steps> findById(Integer id);
    List<Steps> findAll();
}
