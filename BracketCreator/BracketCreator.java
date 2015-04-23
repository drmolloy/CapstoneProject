import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import javax.swing.*;
/**
 * Write a description of class BracketCreater here.
 * 
         * @author (your name) 
 * @version (a version number or a date)
 */
public class BracketCreator
{
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
