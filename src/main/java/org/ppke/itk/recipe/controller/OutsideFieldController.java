package org.ppke.itk.recipe.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.OutsideField;
import org.ppke.itk.recipe.repository.OutsideFieldRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/fields/outsidefields")
public class OutsideFieldController {
    private final OutsideFieldRepository outsideFieldRepository;

    @GetMapping(value = "/{id}")
    public OutsideField getField(@PathVariable Integer id){
        return outsideFieldRepository.findById(id).get();
    }

    @GetMapping("/all")
    public List<OutsideField> getOutsideFields(){
        return outsideFieldRepository.findAll();
    }
}
