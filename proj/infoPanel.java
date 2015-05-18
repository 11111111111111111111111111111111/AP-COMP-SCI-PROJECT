
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class infoPanel extends JPanel
{
    // instance variables - replace the example below with your own
    public infoPanel(int hp, int gold)
    {
       
        
        
        JLabel health = new JLabel("Health:");
        JLabel healthAmount= new JLabel(""+hp);
        JLabel gld= new JLabel("Gold:");
        JLabel goldAmount = new JLabel(""+gold);
        JPanel panel = new JPanel();
        panel.add(health);
        panel.add(healthAmount);
        panel.add(gld);
        panel.add(goldAmount);
       
        this.add(panel);
        
      
    }

    
}