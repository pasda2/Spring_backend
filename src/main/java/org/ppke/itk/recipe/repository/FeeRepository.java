package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.Fee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FeeRepository extends JpaRepository<Fee, Integer> {
    Optional<Fee> findFeeById(Integer id);
    List<Fee> findAll();
    Page<Fee> findAll(Pageable page);
}
