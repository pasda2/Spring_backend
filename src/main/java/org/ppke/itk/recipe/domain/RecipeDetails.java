package org.ppke.itk.recipe.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RecipeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    @JsonManagedReference
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "recipeDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Steps> steps;
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipeDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredients> ingredients;
}
