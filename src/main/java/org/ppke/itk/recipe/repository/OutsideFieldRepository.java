package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.OutsideField;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OutsideFieldRepository extends JpaRepository<OutsideField,Integer> {
    @Override
    Optional<OutsideField> findById(Integer id);

    @Override
    List<OutsideField> findAll();
}
