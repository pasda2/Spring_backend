package org.ppke.itk.monopoly.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.monopoly.domain.GameMaster;
import org.ppke.itk.monopoly.repository.GameMasterRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GameMasterController {
    private final GameMasterRepository gameMasterRepository;

    @GetMapping(value="/gamemasters/{id}" , produces = { MediaType.APPLICATION_XML_VALUE })
    public @ResponseBody GameMaster get(@PathVariable Integer id){
        Optional<GameMaster> gameMaster = gameMasterRepository.findGameMasterById(id);
        String re="";
        if (gameMaster.isPresent()) {
            return gameMaster.get();
        }else {
            throw new NoSuchElementException(String.format("No game master found for id %s", id));
        }
    }
    /*public GameMaster get(@PathVariable Integer id)
    {

        Optional<GameMaster> gameMaster = gameMasterRepository.findGameMasterById(id);
        String re="";
        if (gameMaster.isPresent()) {
            return gameMaster.get();
        }else {
            throw new NoSuchElementException(String.format("No game master found for id %s", id));
        }

    }*/
}
