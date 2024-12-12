package org.ppke.itk.recipe.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.Ingredients;
import org.ppke.itk.recipe.domain.Recipe;
import org.ppke.itk.recipe.domain.RecipeDetails;
import org.ppke.itk.recipe.domain.Steps;
import org.ppke.itk.recipe.repository.RecipeRepo;
import org.ppke.itk.recipe.repository.RecipeSaverRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/recipelist")
@CrossOrigin(origins = "http://localhost:4200")
public class RecipeController {
    private final RecipeRepo recipeRepo;
    private final RecipeSaverRepo recipeSaverRepo;

    @GetMapping(value="/{id}",produces = APPLICATION_JSON_VALUE)
    //@GetMapping("/{id}" )
    public Recipe findById(@PathVariable Integer id) {
        System.out.println(recipeRepo.findById(id).get().getDetails());
        return recipeRepo.findById(id).orElse(null);}

    @GetMapping(value="/all",produces = APPLICATION_JSON_VALUE)
    public List<Recipe> findAll() {
        return recipeRepo.findAll();
    }
    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Recipe> saveRecipe(@RequestBody Map<String, Object> rawJson){

        System.out.println(rawJson);
        List<Ingredients> ingreds=new ArrayList<>();;
        List<Map<String, Object>> steps=(List<Map<String, Object>>) rawJson.get("steps");
        List<Steps> stepss=new ArrayList<>();
        RecipeDetails details=new RecipeDetails();
        details.setDescription(rawJson.get("detailsdesc").toString());
        int i=0;

        for (Map<String, Object> step : steps) {
            int j=0;
            Steps step1=new Steps();
            step1.setDescription(step.get("description").toString());
            step1.setRecipeDetails(details);
            List<Map<String,Object>> ingredientsList = (List<Map<String, Object>>) step.get("ingredients");
            List<Ingredients> stepingreds=new ArrayList<>();
            for (Map<String, Object> ingredient : ingredientsList) {
                Ingredients ing=new Ingredients();
                ing.setName((String) ingredient.get("name"));
                ing.setDescription((String) ingredient.get("description"));
                ing.setStep(step1);
                ing.setRecipeDetails(details);
                ingreds.add(ing);
                stepingreds.add(ing);
                j=j+1;
            }
            step1.setIngredients(stepingreds);
            i=i+1;
            stepss.add(step1);
        }
        System.out.println(stepss.toArray().length);

        details.setIngredients(ingreds);
        details.setSteps(stepss);
        Recipe recipe=new Recipe();
        recipe.setDetails(details);
        recipe.setDescription(rawJson.get("preview").toString());
        recipe.setName(rawJson.get("name").toString());
        recipe.setAuthor(rawJson.get("author").toString());
        recipe.setImage(rawJson.get("picpath").toString());

        recipeSaverRepo.saveRecipe(recipe);

        return new ResponseEntity<>(recipe, HttpStatus.CREATED);
    }
}
