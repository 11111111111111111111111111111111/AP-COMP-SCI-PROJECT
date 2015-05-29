import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class infoPanel extends JPanel
{
    public infoPanel(int score)
    {
        JLabel score1 = new JLabel("Score:");
        JLabel scoreAmount= new JLabel(""+score1);
        JPanel panel = new JPanel();
        panel.add(score1);
        panel.add(scoreAmount);
       
        this.add(panel);
        repaint();

    }
}