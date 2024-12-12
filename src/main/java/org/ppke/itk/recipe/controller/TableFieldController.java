package org.ppke.itk.recipe.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.TableField;
import org.ppke.itk.recipe.repository.CostumTableFieldRepository;
import org.ppke.itk.recipe.repository.TableFieldRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/fields/tablefields")
@RestController
@RequiredArgsConstructor
public class TableFieldController {
    private final TableFieldRepository tableFieldRepository;
    private final CostumTableFieldRepository costumTableFieldRepository;

    @GetMapping(value = "/{id}")
    public TableField getField(@PathVariable Integer id){
        return tableFieldRepository.findById(id).get();
    }
    @PostMapping(value = "/{id}/{name}/{price}")
    public TableField saveField(@PathVariable Integer id,@PathVariable String name,@PathVariable Integer price){
        return costumTableFieldRepository.saveField(id,name,price);
    }

    @DeleteMapping(value = "/{id}")
    public List<TableField> deleteField(@PathVariable Integer id){
        costumTableFieldRepository.deleteField(id);
        return tableFieldRepository.findAll();
    }
}
