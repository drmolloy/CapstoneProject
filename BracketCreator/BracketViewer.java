import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class BracketViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Bracket");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        BracketCreator bc = new BracketCreator();
        ArrayList<Team> teams = bc.initTeams();
        teams = bc.sort(teams);
        //frame.setContentPane(new JLabel(new ImageIcon("bracket.jpg")));
        frame.setVisible(true);
        JPanel first = new JPanel();
        frame.setLayout(null);
        JLabel firstSeed = new JLabel(teams.get(0).getName()+" ("+String.valueOf(teams.get(0).getWins())+")");
        firstSeed.setLocation(0,0);
        first.add(firstSeed);
        frame.add(first);
    }
}
