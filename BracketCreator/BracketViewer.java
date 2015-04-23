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
        JPanel first = new JPanel();
        first.setLayout(null);
        JLabel firstSeed = new JLabel(teams.get(0).getName()+" ("+String.valueOf(teams.get(0).getWins())+")");
        firstSeed.setBounds(10,0,50,50);
        first.add(firstSeed);
        frame.add(first);
        JLabel secondSeed = new JLabel(teams.get(1).getName()+" ("+String.valueOf(teams.get(0).getWins())+")");
        secondSeed.setBounds(10,30,50,50);
        first.add(secondSeed);
        frame.add(first);
        frame.setVisible(true);
    }
}
