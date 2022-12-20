package com.example.boot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //tells Spring the class represents data in the database
@Table(name= "teams")  //tells Spring that the table to match this class to is called "teams"
public class Team {
    @Id  //tells Spring this is the primary key
    @Column(name = "team_id")   ///tells Spring to match the field with the column provided
    private int teamID;
    @Column(name = "team_name")
    private String teamName;
    public int getTeamID() {
        return teamID;
    }
    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    @Override
    public String toString(){   //just overriding the default toString() in case we wish to call it
        return "Team [teamID= "+teamID+", teamName= "+teamName+"]";
    }
}
