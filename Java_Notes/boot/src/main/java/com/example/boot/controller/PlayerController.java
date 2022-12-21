package com.example.boot.controller;

import java.util.List;

import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.Exceptions.EntityNotFound;
import com.example.boot.entities.Player;
import com.example.boot.service.PlayerService;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    //allows us to specify
    @ExceptionHandler(EntityNotFound.class)
    public ResponseEntity<String> entityNotFound(EntityNotFound e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    //if name is too long for the table
    @ExceptionHandler(PSQLException.class)
    public ResponseEntity<String> sqlIssue(PSQLException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> deleteFailed(EmptyResultDataAccessException e){
        return new ResponseEntity<>("Could not delete player.", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/player/id/{id}")
    public ResponseEntity<Player> findById(@PathVariable int id){
        return new ResponseEntity<>(this.playerService.findPlayerById(id), HttpStatus.OK);
    }
    //Example code for what would need to be done if the 1st line of code wasnt there
    @GetMapping("/player/{name}")
    public ResponseEntity<Player> findByName(@PathVariable String name){
        return new ResponseEntity<>(this.playerService.findByPlayerName(name), HttpStatus.OK);
        // Player player = this.playerService.findByPlayerName(name);
        // if (player.getPlayerId() != 0) {
        //     return new ResponseEntity<>(player, HttpStatus.OK);
        // } else {
        //     return new ResponseEntity<>(player, HttpStatus.NOT_FOUND);
        // }
    }
    //Example code for a list object
    @GetMapping("/player")
    public ResponseEntity<List<Player>> findAll(){
        return new ResponseEntity<>(this.playerService.findAllPlayers(), HttpStatus.OK);
        // List<Player> players = this.playerService.findAllPlayers();
        // if(players.size() != 0){
        //     return new ResponseEntity<>(players, HttpStatus.OK);
        // }else{
        //     return new ResponseEntity<>(players, HttpStatus.NOT_FOUND);
        // }
    }
    @PostMapping("/player")
    public ResponseEntity<String> createPlayer(@RequestBody Player player){
        String message = this.playerService.createPlayer(player);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
    @PatchMapping
    public ResponseEntity<String> updatePlayer(@RequestBody Player player){
        return new ResponseEntity<>(this.playerService.updatePlayer(player), HttpStatus.OK);
    }
    @DeleteMapping("player/{id}")
    public ResponseEntity<String> deletePlayerById(@PathVariable int id){
        return new ResponseEntity<>(this.playerService.deletePlayerById(id), HttpStatus.OK);
    //     try {
    //         String message = this.playerService.deletePlayerById(id);
    //         return new ResponseEntity<>(message, HttpStatus.OK);
    //     } catch (EmptyResultDataAccessException e) {
    //         return new ResponseEntity<>("Player with given id not found.", HttpStatus.BAD_REQUEST);
    //     }
    // }
    }
}
