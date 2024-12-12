package org.ppke.itk.recipe.controller;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.Favorites;
import org.ppke.itk.recipe.domain.User;
import org.ppke.itk.recipe.repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/favorites")
@CrossOrigin(origins = "http://localhost:4200")
public class FavoritesController {
    private final UserRepository userRepository;
    private final RecipeRepo recipeRepo;
    private final FavoritesRepo favoritesRepo;
    private final EntityManager entityManager;
    private final RecipeSaverRepo recipeSaverRepo;

    @GetMapping(value = "all",produces = APPLICATION_JSON_VALUE)
    public List<Favorites> getAllFavorites() {
        return favoritesRepo.findAll();
    }

    @GetMapping(value = "/{id}",produces = APPLICATION_JSON_VALUE)
    public List<Favorites> findByUserId(@PathVariable int id) {
        return favoritesRepo.findByUserId(id);
    }

    @PostMapping(value="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Favorites saveFavorites(@RequestBody Map<String, Object> rawJson) {
        System.out.println(rawJson);
        Favorites favorites = new Favorites();
        System.out.println(userRepository.findById((Integer)rawJson.get("userid")).orElse(null));
        favorites.setUser(userRepository.findById((Integer)rawJson.get("userid")).orElse(null));
        favorites.setRecipe(recipeRepo.findById((Integer)rawJson.get("recipeid")).orElse(null));
        recipeSaverRepo.saveFavorites(favorites);
        //entityManager.persist(favorites);
        return null;
    }

    @PostMapping(value = "/delete/{id}")
    public void deleteFavorites(@PathVariable int id) {
        recipeSaverRepo.deleteFavorites(favoritesRepo.findById(id).orElse(null));
    }

}
