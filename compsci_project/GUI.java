import java.awt.*;
import javax.swing.*;

public class GUI 
{
 
    public static void main(String[] args)
    {
        
        JFrame frame = new JFrame ("Stay Alive");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1200,800));


        frame.getContentPane().add(new Game());


        frame.pack();
        frame.setVisible(true);
    }
}