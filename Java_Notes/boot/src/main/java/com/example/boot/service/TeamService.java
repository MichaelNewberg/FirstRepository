package com.example.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.Exceptions.EntityNotFound;
import com.example.boot.entities.Team;
import com.example.boot.repository.TeamDao;

@Service    //tells Spring this class handles service layer operations
public class TeamService {
    @Autowired  //tells Spring to instantiate the field when a TeamService object is created
    private TeamDao teamDao;

    public Team getTeambyID(int id){
        Optional<Team> possibleTeam = this.teamDao.findById(id);    //findById is provided by JPA repository
        if(possibleTeam.isPresent()){   //isPresent returns true if the object we want was returned in Optional
            return possibleTeam.get();  //get() returns the ojbect we want if it is present
        }else{
            throw new EntityNotFound("Team not found.");
        }
    }

    public Team getTeambyName(String name){
        Optional<Team> possibleteam = this.teamDao.findByTeamName(name);
        if(possibleteam.isPresent()){
            return possibleteam.get();
        }else{
            throw new EntityNotFound("Team not found.");
        }
    }

    public List<Team> getAllTeams(){
        List<Team> teams = this.teamDao.findAll();//findAll already defined, getting from JPA
        if (teams.size() != 0) {
            return teams;
        } else {
            throw new EntityNotFound("No teams were found.");
        }
    }

    public String createTeam(Team team){
        this.teamDao.createTeam(team.getTeamName());
        return "Team created successfully";
    }

    public String updateTeam(String teamName, int id){
        int result = this.teamDao.updateTeam(teamName, id);
        if(result == 1){
            return "Team updated successfully.";
        }else{
            return "Oops, something went wrong.";
        }
    }

    public String deleteTeam(int id){
        this.teamDao.deleteById(id);
        return "Deleted team with id of: "+ id;
    }
}
