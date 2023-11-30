package org.ppke.itk.monopoly.repository;

import org.ppke.itk.monopoly.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findById(Integer id);
    List<User> findAll();
    Page<User> findAll(Pageable page);
    Optional<User> findUserByName(String name);
}
