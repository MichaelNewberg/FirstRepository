package com.example.boot.controller;

import java.util.List;

import org.postgresql.util.PSQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.example.boot.Exceptions.AuthenticationFailed;
import com.example.boot.Exceptions.EntityNotFound;
import com.example.boot.entities.Team;
import com.example.boot.service.TeamService;


@RestController //this tells Spring we are using this class as a controller to handle http requests&responses
public class TeamController {

    private static Logger teamLogger = LoggerFactory.getLogger(TeamController.class);

    @Autowired
    private TeamService teamService;

    @ExceptionHandler(AuthenticationFailed.class)
    public ResponseEntity<String> authenicationFailed(AuthenticationFailed e){
        teamLogger.error(e.getLocalizedMessage(), e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    //allows all objects in this class to use a custom exception message and to use less code (see below)
    @ExceptionHandler(EntityNotFound.class)
    public ResponseEntity<String> entityNotFound(EntityNotFound e){
        teamLogger.error(e.getLocalizedMessage(), e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    //if name is too long for the table
    @ExceptionHandler(PSQLException.class)
    public ResponseEntity<String> sqlIssue(PSQLException e){
        teamLogger.error(e.getLocalizedMessage(), e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> deleteFailed(EmptyResultDataAccessException e){
        teamLogger.error(e.getLocalizedMessage(), e);
        return new ResponseEntity<>("Could not delete team.", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/api/team/id/{id}")
    public ResponseEntity<Team> getTeambyId(@PathVariable int id){
        teamLogger.info("Get getTeambyId() called.");
        return new ResponseEntity<>(this.teamService.getTeambyID(id), HttpStatus.OK);
        // Team team = this.teamService.getTeambyID(id);   //getTeambyID will return a team
        // if(team.getTeamID() != 0){  //check to see if team has an initialized id
        //     return new ResponseEntity<>(team, HttpStatus.OK);   //return team with success message if there is data
        // }else{
        //     return new ResponseEntity<>(team, HttpStatus.NOT_FOUND);    //return empty team and 404 error
        // }
    }

    @GetMapping("/api/team/{name}")
    public ResponseEntity<Team> getTeambyName(@PathVariable String name){
        teamLogger.info("Get getTeambyName() called.");
        return new ResponseEntity<>(this.teamService.getTeambyName(name), HttpStatus.OK);
    }

    @GetMapping(value="/api/team")
    public ResponseEntity<List<Team>> getAllTeams() {
        System.out.println("getAllTeams API method called.");
        teamLogger.info("Get getAllTeams() called.");
        return new ResponseEntity<>(this.teamService.getAllTeams(), HttpStatus.OK);
    }

    @PostMapping("/api/team")
    public ResponseEntity<String> createTeam(@RequestBody Team team){
        teamLogger.info("Get createTeam() called.");
        return new ResponseEntity<>(this.teamService.createTeam(team), HttpStatus.CREATED);
    }

    @PatchMapping("/api/team")
    public ResponseEntity<String> updateTeam(@RequestBody Team team){
        teamLogger.info("Get updateTeam() called.");
        return new ResponseEntity<>(this.teamService.updateTeam(team.getTeamName(), team.getTeamID()), HttpStatus.OK);
    }

    @DeleteMapping("/api/team/{id}")
    public ResponseEntity<String> deleteTeamById(@PathVariable int id){
        teamLogger.info("Get deleteTeamById() called.");
        return new ResponseEntity<>(this.teamService.deleteTeam(id), HttpStatus.OK); 
    }
}
