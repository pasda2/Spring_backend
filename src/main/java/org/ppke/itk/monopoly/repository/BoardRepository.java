package org.ppke.itk.monopoly.repository;

import org.ppke.itk.monopoly.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board,Integer> {
    Optional<Board> findBoardById(Integer id);

    List<Board> findAll();
}
