
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class infoPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private int health;
    private int gold;
    
    public infoPanel(int hp, int gd)
    {
       health=hp;
       gold=gd;
        JLabel health = new JLabel("Health:");
        JLabel healthAmount= new JLabel(""+hp);
        JLabel gld= new JLabel("Gold:");
        JLabel goldAmount = new JLabel(""+gd);
        JPanel panel = new JPanel();
        panel.add(health);
        panel.add(healthAmount);
        panel.add(gld);
        panel.add(goldAmount);
        this.add(panel);
        repaint();

    }
     public void changeHp(int hp)
    {   
        health+=hp;
    }
    public void changeGd(int gd){
        gold+=gd;
        
    }

    
}