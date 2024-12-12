package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.TableField;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TableFieldRepository extends JpaRepository<TableField,Integer> {
    @Override
    Optional<TableField> findById(Integer id);
    Optional<TableField> findTableFieldByNameAndBoardId(String name,Integer boardId);
    @Override
    List<TableField> findAll();
}
