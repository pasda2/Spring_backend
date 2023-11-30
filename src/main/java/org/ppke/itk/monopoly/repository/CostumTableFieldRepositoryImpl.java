package org.ppke.itk.monopoly.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.ppke.itk.monopoly.domain.GameMaster;
import org.ppke.itk.monopoly.domain.TableField;
import org.ppke.itk.monopoly.domain.Team;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CostumTableFieldRepositoryImpl implements CostumTableFieldRepository {
    @PersistenceContext
    private final EntityManager entityManager;
    private final TableFieldRepository tableFieldRepository;
    private final BoardRepository boardRepository;
    private final TeamRepository teamRepository;
    private final GameMasterRepository gameMasterRepository;
    TableField tableField;

    @Override
    public TableField saveField(Integer id, String name, Integer price) {
        Optional<TableField> field=tableFieldRepository.findById(id);
        if (field.isEmpty()) {
            throw new NoSuchElementException(String.format("No table field found for id %s", id));
        }
        if (field.isPresent()) {
            tableField=field.get();
            tableField.setName(name);
            tableField.setPrice(price);
            tableFieldRepository.saveAndFlush(tableField);
        }else{
            tableField=new TableField();
            tableField.setId(id);
            tableField.setName(name);
            tableField.setPrice(price);
            entityManager.persist(tableField);
        }
        return tableField;
    }
    public TableField changeTeam(Integer fieldId,Integer teamId){
        Optional<TableField> field=tableFieldRepository.findById(fieldId);
        Team team0;
        if (field.isEmpty()) {
            throw new NoSuchElementException(String.format("No table field found for id %s", fieldId));
        }
        Optional<Team> team=teamRepository.findById(teamId);
        if (team.isEmpty()) {
            throw new NoSuchElementException(String.format("No team found for id %s", teamId));
        }
        if (field.isPresent() && team.isPresent()) {
            tableField=field.get();
            if (tableField.getTeam()!=null) {
                List<TableField> fieldList=tableField.getTeam().getFields();
                fieldList.remove(tableField);
                team0=tableField.getTeam();
                team0.setFields(fieldList);
                teamRepository.saveAndFlush(team0);
            }
            tableField=field.get();
            tableField.setTeam(team.get());
            tableFieldRepository.saveAndFlush(tableField);
            team0=team.get();
            List<TableField> fields=team0.getFields();
            fields.add(tableField);
            team0.setFields(fields);
            teamRepository.saveAndFlush(team0);
        }
        return tableField;
    }
    @Override
    @Transactional
    public void deleteField(Integer id) {
        Optional<TableField> t=tableFieldRepository.findById(id);
        if (t.isPresent()){
            entityManager.remove(t.get());
        }else{
            throw new NoSuchElementException(String.format("No table field found for id %s", id));
        }
    }
}
