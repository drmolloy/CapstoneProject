import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class BracketCreater here.
 * 
         * @author (your name) 
 * @version (a version number or a date)
 */
public class BracketCreator 
{
    public static void main(String[] args)
    {
        int numTeams = 4;
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

    
        for (int j = 0; j < teams.size(); j++)
        {
            System.out.print(teams.get(j).toString());
        }
        
    }
}
