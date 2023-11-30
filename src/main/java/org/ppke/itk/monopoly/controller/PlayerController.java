package org.ppke.itk.monopoly.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.monopoly.domain.Player;
import org.ppke.itk.monopoly.repository.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PlayerController {
    PlayerRepository playerRepository;
    @GetMapping(value = "/players/{id}")
    public Player getPlayer(@PathVariable Integer id){
        return playerRepository.findById(id).get();
    }
    @GetMapping("/players")
    public List<Player> getOutsideFields(){
        return playerRepository.findAll();
    }
}
