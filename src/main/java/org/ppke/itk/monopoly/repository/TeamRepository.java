package org.ppke.itk.monopoly.repository;

import org.ppke.itk.monopoly.domain.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeamRepository extends  JpaRepository<Team, Integer>{
    List<Team> findAll();
    //Page<Team> findAll(Pageable page);
    Optional<Team> findTeamById(Integer id);
    List<Team> findByBalanceLessThan(Integer limit);
}
