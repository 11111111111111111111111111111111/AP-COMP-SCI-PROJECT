// ******************************************************************
//   MoveCircle.java
//
//   Uses CirclePanel to display a GUI that lets the user move
//   a circle by pressing buttons.
// ******************************************************************

import java.awt.*;
import javax.swing.*;

/**
 * Class where the game is drawn (this is the GUI as the name hints)
 * 
 * @author Aditya, Prahlad, Andrew, Go
 * @version 1.0
 */
public class GUI 
{
 
    public static void main(String[] args)
    {
        int hp=10;
        int gold=1000;
        JFrame frame = new JFrame ("Stay Alive");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1200,800));


        frame.getContentPane().add(new Game(500,500));


        frame.pack();
        frame.setVisible(true);
    }
}