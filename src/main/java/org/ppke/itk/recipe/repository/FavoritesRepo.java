package org.ppke.itk.recipe.repository;

import org.ppke.itk.recipe.domain.Favorites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FavoritesRepo extends JpaRepository<Favorites, Integer> {
    Optional<Favorites> findById(Integer id);
    List<Favorites> findAll();
    List<Favorites> findByUserId(int userId);
    Favorites save(Favorites favorites);
    void deleteById(Integer id);
}
