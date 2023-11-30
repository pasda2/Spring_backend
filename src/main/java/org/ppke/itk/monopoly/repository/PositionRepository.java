package org.ppke.itk.monopoly.repository;

import org.ppke.itk.monopoly.domain.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PositionRepository extends JpaRepository<Position,Integer> {
    @Override
    Optional<Position> findById(Integer id);

}
