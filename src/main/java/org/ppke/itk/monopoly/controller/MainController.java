package org.ppke.itk.monopoly.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.monopoly.domain.*;
import org.ppke.itk.monopoly.repository.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MainController {
    private final GameMasterRepository gameMasterRepository;
    private final BoardRepository boardRepository;
    private final FeeRepository feeRepository;
    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;
    private final OutsideFieldRepository outsideFieldRepository;
    private final TableFieldRepository tableFieldRepository;

    @GetMapping(value ="/fees/{id}", produces = APPLICATION_JSON_VALUE)
    public Fee getFeeById(@PathVariable("id") Integer id) {
        return feeRepository.findFeeById(id).get();
    }
    @GetMapping(value ="/fields/{id}", produces = APPLICATION_JSON_VALUE)
    public TableField getFieldById(@PathVariable("id") Integer id) {
        return tableFieldRepository.findById(id).get();
    }
    @GetMapping(value ="/boards/{id}", produces = APPLICATION_JSON_VALUE)
    public Board getBoardById(@PathVariable("id") Integer id) {

        return boardRepository.findBoardById(id).get();
    }
    @GetMapping(value ="/game_masters/{id}", produces = APPLICATION_JSON_VALUE)
    public GameMaster getGameMasterById(@PathVariable("id") Integer id) {

        return gameMasterRepository.findGameMasterById(id).get();
    }

}
