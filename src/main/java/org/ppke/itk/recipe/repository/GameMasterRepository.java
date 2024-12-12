package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.GameMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GameMasterRepository extends JpaRepository<GameMaster,Integer> {
    Optional<GameMaster> findGameMasterById(Integer id);
    Optional<GameMaster> findGameMasterByName(String name);
    List<GameMaster> findAll();
}
