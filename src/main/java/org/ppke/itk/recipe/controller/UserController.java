package org.ppke.itk.recipe.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.User;
import org.ppke.itk.recipe.repository.UserRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    @GetMapping(value = "all",produces = APPLICATION_JSON_VALUE)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/{id}",produces = APPLICATION_JSON_VALUE)
    public User getUserById(@PathVariable int id) {
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody Map<String, Object> rawJson) {
        User user = new User();
        user.setName(rawJson.get("name").toString());
        user.setPassword(rawJson.get("password").toString());
        user.setRole(rawJson.get("role").toString());
        return userRepository.save(user);
    }
}

