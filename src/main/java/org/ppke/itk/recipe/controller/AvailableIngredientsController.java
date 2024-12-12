package org.ppke.itk.recipe.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.AvailableIngredients;
import org.ppke.itk.recipe.domain.Ingredients;
import org.ppke.itk.recipe.repository.AvailableIngredientsRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/availableingredients")
public class AvailableIngredientsController {

    private final AvailableIngredientsRepo availableIngredientsRepo;

    @GetMapping(value="/all",produces = APPLICATION_JSON_VALUE)
    public List<AvailableIngredients> findAll() {
        return availableIngredientsRepo.findAll();
    }
}
