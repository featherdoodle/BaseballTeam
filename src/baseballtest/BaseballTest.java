/*
 * Main class to test the baseball team class
 */

package baseballtest;

import java.util.ArrayList;

/**
 *
 * @author SyBye8898
 */
public class BaseballTest {

    /**
     * 
     */
    public static void main(String[] args) {
        
        String teamName = "Wildcats";
        ArrayList<String> players = new ArrayList<>();
        players.add("Annie");
        players.add("Bob");
        
        BaseballTeam baseballTeam = new BaseballTeam(2, 3, 1, 6, players, teamName);
        
        //testing some methods
        baseballTeam.displayTeamInfo();
        baseballTeam.addPlayer("Cody");
        baseballTeam.displayTeamInfo();
        baseballTeam.removePlayer("Bob");
        baseballTeam.displayTeamInfo();
        
        baseballTeam.displayScore();
        baseballTeam.playGame();
        baseballTeam.displayScore();
    }
    
}
