import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import javax.swing.*;
/**
 * This class asks the user to input the team name and the number of wins that team has. It then stores each team object in an array list. Lastly it sorts the array list
 * and orders the teams from most wins to least wins and returns that as an array list.
 * 
 * @Duncan Molloy
 * @4/24/15
 */
public class BracketCreator
{
    /**
     * This method asks the user to input a team name and the number of wins that team has. It then creates a team object with that information and adds the team object
     * to an array list of all of the team objects and returns that array list.
     */
    public ArrayList<Team> initTeams()
    {
        int numTeams = 16;
        ArrayList<Team> teams = new ArrayList<Team>();
        for (int i = 0; i < numTeams; i++)
        {
            Scanner nameScanner = new Scanner(System.in);
            System.out.println("Enter the team name: ");
            String name = nameScanner.nextLine();
            Scanner winsScanner = new Scanner(System.in);
            System.out.println("Enter the number of wins that team has: ");
            int wins = winsScanner.nextInt();              
            Team team = new Team(name,wins);
            teams.add(team);
        }

    
        return teams;
        
    }
    /**
     * This method itereates through the array list of all of the team objects and sorts them from most wins to least wins. It then returns the array list of teams.
     */
    public ArrayList<Team> sort(ArrayList<Team> teams)
    {
        for (int i = 0; i < teams.size()-1; i++)
        {
            int mostWins = teams.get(i).getWins();
            int indexOfMostWins = i;
            for (int j=i; j<teams.size(); j++)
            {
                if (teams.get(j).getWins() > mostWins)
                {
                    mostWins = teams.get(j).getWins();
                    indexOfMostWins = j;
                }
            }
            Team temp = teams.get(i);
            teams.set(i,teams.get(indexOfMostWins));
            teams.set(indexOfMostWins,temp);
        }
        return teams;
    }
   
    
}
