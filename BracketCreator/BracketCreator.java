import java.util.Scanner;
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
        int numTeams = 0;
        while (numTeams != 4 && numTeams != 8 && numTeams != 16 && numTeams != 32 && numTeams != 64)
        {
            Scanner numScanner = new Scanner(System.in);
            System.out.println("How many teams are in the tournament(Enter: 4,8,16,32,64): ");
            numTeams = numScanner.nextInt();
        }
        for (int i = 0; i < numTeams; i++)
        {
            Scanner nameScanner = new Scanner(System.in);
            System.out.println("Enter the team name: ");
            String name = nameScanner.nextLine();
            Scanner winsScanner = new Scanner(System.in);
            System.out.println("Enter the number of wins that team has: ");
            int wins = winsScanner.nextInt();
            
        }
    }
}
