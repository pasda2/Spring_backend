package org.ppke.itk.monopoly.repository;

import org.ppke.itk.monopoly.domain.GameMaster;
import org.ppke.itk.monopoly.domain.TableField;

public interface CostumTableFieldRepository {
    TableField saveField(Integer id, String name, Integer price);
    TableField changeTeam(Integer fieldId,Integer teamId);
    void deleteField(Integer id);
}
