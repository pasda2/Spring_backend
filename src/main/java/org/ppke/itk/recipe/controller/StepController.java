package org.ppke.itk.recipe.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.Steps;
import org.ppke.itk.recipe.repository.StepsRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/steps")
public class StepController {
    private final StepsRepo stepsRepo;
    @GetMapping("/{id}")
    public Steps findByIs(@PathVariable Integer id) {return stepsRepo.findById(id).get();}
    @GetMapping(value="/all",produces = APPLICATION_JSON_VALUE)
    public List<Steps> findAll() {return stepsRepo.findAll();}
}
