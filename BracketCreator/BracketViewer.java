import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * This class creates a frame and displays all of the teams in a bracket style format with the best 
 * team playing the worst team, the second best team playing the second worst team and so on.
 */
public class BracketViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Bracket");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,400);
        BracketCreator bc = new BracketCreator();
        ArrayList<Team> teams = bc.initTeams();
        teams = bc.sort(teams);
        JPanel first = new JPanel();
        first.setLayout(null);
        JLabel firstSeed = new JLabel("1 "+teams.get(0).getName()+" ("+String.valueOf(teams.get(0).getWins())+")");
        firstSeed.setBounds(10,20,200,50);
        first.add(firstSeed);
        JLabel sixteenSeed = new JLabel("16 "+teams.get(15).getName()+" ("+String.valueOf(teams.get(15).getWins())+")");
        sixteenSeed.setBounds(10,40,200,50);
        first.add(sixteenSeed);
        JLabel eightSeed = new JLabel("8 "+teams.get(7).getName()+" ("+String.valueOf(teams.get(7).getWins())+")");
        eightSeed.setBounds(10,95,200,50);
        first.add(eightSeed);
        JLabel nineSeed = new JLabel("9 "+teams.get(8).getName()+" ("+String.valueOf(teams.get(8).getWins())+")");
        nineSeed.setBounds(10,115,200,50);
        first.add(nineSeed);
        JLabel fourSeed = new JLabel("4 "+teams.get(3).getName()+" ("+String.valueOf(teams.get(3).getWins())+")");
        fourSeed.setBounds(10,170,200,50);
        first.add(fourSeed);
        JLabel thirteenSeed = new JLabel("13 "+teams.get(12).getName()+" ("+String.valueOf(teams.get(12).getWins())+")");
        thirteenSeed.setBounds(10,190,200,50);
        first.add(thirteenSeed);
        JLabel fiveSeed = new JLabel("5 "+teams.get(4).getName()+" ("+String.valueOf(teams.get(4).getWins())+")");
        fiveSeed.setBounds(10,245,200,50);
        first.add(fiveSeed);
        JLabel twelveSeed = new JLabel("12 "+teams.get(11).getName()+" ("+String.valueOf(teams.get(11).getWins())+")");
        twelveSeed.setBounds(10,265,200,50);
        first.add(twelveSeed);
        JLabel twoSeed = new JLabel("2 "+teams.get(1).getName()+" ("+String.valueOf(teams.get(1).getWins())+")");
        twoSeed.setBounds(1000,20,200,50);
        first.add(twoSeed);
        JLabel fifteenSeed = new JLabel("15 "+teams.get(14).getName()+" ("+String.valueOf(teams.get(14).getWins())+")");
        fifteenSeed.setBounds(1000,40,200,50);
        first.add(fifteenSeed);
        JLabel sevenSeed = new JLabel("7 "+teams.get(6).getName()+" ("+String.valueOf(teams.get(6).getWins())+")");
        sevenSeed.setBounds(1000,95,200,50);
        first.add(sevenSeed);
        JLabel tenSeed = new JLabel("10 "+teams.get(9).getName()+" ("+String.valueOf(teams.get(9).getWins())+")");
        tenSeed.setBounds(1000,115,200,50);
        first.add(tenSeed);
        JLabel threeSeed = new JLabel("3 "+teams.get(2).getName()+" ("+String.valueOf(teams.get(2).getWins())+")");
        threeSeed.setBounds(1000,170,200,50);
        first.add(threeSeed);
        JLabel fourteenSeed = new JLabel("14 "+teams.get(13).getName()+" ("+String.valueOf(teams.get(13).getWins())+")");
        fourteenSeed.setBounds(1000,190,200,50);
        first.add(fourteenSeed);
        JLabel sixSeed = new JLabel("6 "+teams.get(5).getName()+" ("+String.valueOf(teams.get(5).getWins())+")");
        sixSeed.setBounds(1000,245,200,50);
        first.add(sixSeed);
        JLabel elevenSeed = new JLabel("11 "+teams.get(10).getName()+" ("+String.valueOf(teams.get(10).getWins())+")");
        elevenSeed.setBounds(1000,265,200,50);
        first.add(elevenSeed);
        JLabel winnerOne = new JLabel("Winner");
        winnerOne.setBounds(200,30,200,50);
        first.add(winnerOne);
        JLabel winnerTwo = new JLabel("Winner");
        winnerTwo.setBounds(200,105,200,50);
        first.add(winnerTwo);
        JLabel winnerThree = new JLabel("Winner");
        winnerThree.setBounds(200,180,200,50);
        first.add(winnerThree);
        JLabel winnerFour = new JLabel("Winner");
        winnerFour.setBounds(200,255,200,50);
        first.add(winnerFour);
        JLabel winnerFive = new JLabel("Winner");
        winnerFive.setBounds(810,30,200,50);
        first.add(winnerFive);
        JLabel winnerSix = new JLabel("Winner");
        winnerSix.setBounds(810,105,200,50);
        first.add(winnerSix);
        JLabel winnerSeven = new JLabel("Winner");
        winnerSeven.setBounds(810,180,200,50);
        first.add(winnerSeven);
        JLabel winnerEight = new JLabel("Winner" );
        winnerEight.setBounds(810,255,200,50);
        first.add(winnerEight);
        JLabel winnerNine = new JLabel("Winner");
        winnerNine.setBounds(300,67,200,50);
        first.add(winnerNine);
        JLabel winnerTen = new JLabel("Winner");
        winnerTen.setBounds(300,217,200,50);
        first.add(winnerTen);
        JLabel winnerEleven = new JLabel("Winner");
        winnerEleven.setBounds(710,67,200,50);
        first.add(winnerEleven);
        JLabel winnerTwelve = new JLabel("Winner");
        winnerTwelve.setBounds(710,217,200,50);
        first.add(winnerTwelve);
        JLabel winnerThirteen = new JLabel("Winner");
        winnerThirteen.setBounds(400,142,200,50);
        first.add(winnerThirteen);
        JLabel winnerFourteen = new JLabel("Winner");
        winnerFourteen.setBounds(610,142,200,50);
        first.add(winnerFourteen);
        JLabel champion = new JLabel("Champion");
        champion.setBounds(500,250,200,50);
        first.add(champion);
        frame.add(first);
        frame.setVisible(true);
    }
}
