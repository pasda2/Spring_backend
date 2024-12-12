package org.ppke.itk.recipe.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.RecipeDetails;
import org.ppke.itk.recipe.repository.RecipeDetailsRepo;
import org.springframework.web.bind.annotation.*;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/recipedetails")
public class RecipeDetailsController {
    private final RecipeDetailsRepo repo;

    @GetMapping(value="/{id}",produces = APPLICATION_JSON_VALUE)
    public RecipeDetails findById(@PathVariable Integer id) {return repo.findById(id).get();}

    //@PostMapping("/{id}/delete")
    //public void deleteById(@PathVariable Integer id) {repo.deleteById(id);}
}
