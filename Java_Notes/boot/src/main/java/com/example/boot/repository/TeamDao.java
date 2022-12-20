package com.example.boot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.boot.entities.Team;
//Don't NEED to add anything else to this interface, we could make use of built in methods Spring data provides, but doe to our custom
//needs we will add a few methods
public interface TeamDao extends JpaRepository<Team,Integer>{
    //as long as proper naming conventions are followed(findBy{field}) Spring can handle the boilerplate code for getting
    //data from the database
    Optional<Team> findByTeamName(String name); //this is all that is needed for this method

    @Transactional //tells that @Query will make a change to the table
    @Modifying //need this in order to INSERT with @Query, by default it doesnt do INSERT
    @Query(value="insert into teams values(default, :teamName)", nativeQuery = true) //:variable Spring sees as a placeholder
    //need to have nativeQuery=true to set it as native SQL and not JPA sql
    int createTeam(@Param("teamName") String teamName);//@Param("teamName") tells Spring to replace placeholder with given parameter

    @Transactional
    @Modifying
    @Query(value="update teams set team_name = :teamName where team_id = :teamId", nativeQuery = true)
    int updateTeam(@Param("teamName") String teamName, @Param("teamId") int id);
}
