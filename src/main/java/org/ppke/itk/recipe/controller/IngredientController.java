package org.ppke.itk.recipe.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.Ingredients;
import org.ppke.itk.recipe.repository.IngredientRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ingredients")
public class IngredientController {
    private final IngredientRepo ingredientRepo;

    @GetMapping(value="/all",produces = APPLICATION_JSON_VALUE)
    public List<Ingredients> findAll() {
        return ingredientRepo.findAll();
    }
}
