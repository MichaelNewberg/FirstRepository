package com.example.boot.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.Exceptions.EntityNotFound;
import com.example.boot.entities.Player;
import com.example.boot.repository.PlayerDao;

@Service
public class PlayerService {
    @Autowired
    private PlayerDao playerDao;

    public Player findPlayerById(int id){
        Optional<Player> possiblePlayer = this.playerDao.findById(id);
        if (possiblePlayer.isPresent()) {
            return possiblePlayer.get();
        } else {
            throw new EntityNotFound("Player not found.");
        }
    }

    public Player findByPlayerName(String name){
        Optional<Player> possiblePlayer = this.playerDao.findByPlayerName(name);
        if (possiblePlayer.isPresent()) {
            return possiblePlayer.get();
        } else {
            throw new EntityNotFound("Player not found");
        }
    }

    public List<Player> findAllPlayers(){
        List<Player> players = this.playerDao.findAll();
        if (players.size() != 0) {
            return players;
        } else {
            throw new EntityNotFound("No players found in database.");
        }
    }
    
    public String createPlayer(Player player){
        this.playerDao.createPlayer(player.getPlayername(), player.getPlayerTeamId());
        return "Player created successfully";
    }

    public String updatePlayer(Player player){
        int rowCount = this.playerDao.updatePlayer(player.getPlayername(), player.getPlayerTeamId(), player.getPlayerId());
        if (rowCount == 1) {
            return "Player updated.";
        } else {
            throw new EntityNotFound("Could not update specified player.");
        }
    }

    public String deletePlayerById(int id){
        this.playerDao.deleteById(id);
        return "Player with given id deleted.";

    }

}
