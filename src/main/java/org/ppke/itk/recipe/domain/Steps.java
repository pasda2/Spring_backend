package org.ppke.itk.recipe.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Steps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    @JsonManagedReference
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "step" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredients> ingredients;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "recipe_details_id")
    private RecipeDetails recipeDetails;
}
