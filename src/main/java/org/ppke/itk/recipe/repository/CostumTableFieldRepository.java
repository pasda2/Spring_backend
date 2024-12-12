package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.TableField;

public interface CostumTableFieldRepository {
    TableField saveField(Integer id, String name, Integer price);
    TableField changeTeam(Integer fieldId,Integer teamId);
    void deleteField(Integer id);
}
