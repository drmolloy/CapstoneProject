import java.awt.*;
import javax.swing.*;

public class BracketViewer
{
    public static void main(String[] args)
    {
        BracketViewer viewer = new BracketViewer();
    }
    public BracketViewer()
    {
        JFrame frame = new JFrame();
        frame.setTitle("Bracket");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setContentPane(new JLabel(new ImageIcon("bracket.jpg")));
        frame.setVisible(true);
    }
}