/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author SyBye8898
 */
public class BaseballTeam extends Sports implements Stats{
    
    /**
     * Constructor for BaseballTeam that sets the wins, ties, losses, totalGames, players, and teamName for the team
     * @param _wins
     * @param _ties
     * @param _losses
     * @param _totalGames
     * @param _players
     * @param _teamName 
     */
    public BaseballTeam(int _wins, int _ties, int _losses, int _totalGames, ArrayList<String> _players, String _teamName){
        wins = _wins;
        ties = _ties;
        losses = _losses;
        totalGames = _totalGames;
        players = _players;
        teamName = _teamName;
    }
    /**
     * adds a player to the team
     * pre: requires a string
     * post: name is added to player array
     * @param name 
     */
    @Override
    public void addPlayer(String name){
        players.add(name);
    }
    
    /**
     * removes a player from the team
     * pre: requires a string
     * post: name is removed from player array
     * @param name 
     */
    @Override
    public void removePlayer(String name){
        players.remove(name);
    }
    
    /**
     * result of the game is determined randomly
     * pre: none
     * post: score is updated, and totalGames is increased by one
     */
    @Override
    public void playGame(){
        Random random = new Random();
        int gameResult = random.nextInt(3);
        if(gameResult == 0){
            wins++;
        }else if(gameResult == 1){
            ties++;
        }else if(gameResult == 2){
            losses++;
        }
        totalGames++;
    }
    
    /**
     * displays team information
     * pre: none
     * post: prints out teamName and players
     */
    @Override
    public void displayTeamInfo(){
        System.out.println("Team Name: " + teamName + "\nPlayers: " + players + "\n");
    }
    
    /**
     * displays score information for the team
     * pre: none
     * post: prints out totalGames, wins, ties, losses, and the total score
     */
    @Override
    public void displayScore(){
        System.out.println("Total Games: " + totalGames + "\nWins: " + wins 
                + "\nTies: " + ties + "\nLosses: " + losses + "\nTotal Score: " + overallPoints() + "\n");
    }
    
    /**
     * calculates the overallPoints
     * pre: none
     * post: returns an int for points
     * @return 
     */
    @Override
    public int overallPoints(){
        int points = 0;
        points += wins*2;
        points += ties;
        return points;
    }
    
}
