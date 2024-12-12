package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeamRepository extends  JpaRepository<Team, Integer>{
    List<Team> findAll();
    //Page<Team> findAll(Pageable page);
    Optional<Team> findTeamById(Integer id);
    List<Team> findByBalanceLessThan(Integer limit);
}
