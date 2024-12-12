package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
    @Override
    Optional<Player> findById(Integer id);

    @Override
    List<Player> findAll();
}
