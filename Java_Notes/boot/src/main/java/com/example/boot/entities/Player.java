package com.example.boot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player {
    @Id
    @Column(name="player_id")
    private int playerId;
    @Column(name="player_name")
    private String playername;
    @Column(name="player_team_id")
    private int playerTeamId;
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getPlayername() {
        return playername;
    }
    public void setPlayername(String playername) {
        this.playername = playername;
    }
    public int getPlayerTeamId() {
        return playerTeamId;
    }
    public void setPlayerTeamId(int playerTeamId) {
        this.playerTeamId = playerTeamId;
    }
    @Override
    public String toString() {//just overriding the default toString() in case we wish to call it
        return "Player [playerId=" + playerId + ", playername=" + playername + ", playerTeamId=" + playerTeamId + "]";
    }
}
