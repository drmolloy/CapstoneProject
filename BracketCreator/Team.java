import javax.swing.JPanel;
import javax.swing.JLabel;
public class Team
{
    private String name;
    private int wins;
    private JPanel team;
    private JLabel nameLabel;
    private JLabel winLabel;
    /**
     * Constructs a team object
     * @param aName the name of the team
     * @param aWins the number of wins the team has
     */
    public Team(String aName, int aWins)
    {
        name = aName;
        wins = aWins;
        
        team = new JPanel();
        
        nameLabel = new JLabel(name);
        winLabel = new JLabel(String.valueOf(wins));
        
        team.add(nameLabel);
        team.add(winLabel);
    }
    /**
     * This method return the team's name
     */
    public String getName()
    {
        return name;
    }
    /**
     * This method return the team's wins
     */
    public int getWins()
    {
        return wins;
    }
    /**
     * This method return the team's name and wins together as a string
     */
    public String toString()
    {
        return name+" "+wins;
    }
}
