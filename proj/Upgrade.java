// ******************************************************************
//   CirclePanel.java
//
//   A panel with a circle drawn in the center and buttons on the 
//   bottom that move the circle.
// ******************************************************************
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.JFrame;
public class Upgrade extends JPanel
{
    private Player pikachu;
    private JButton speed;
    private JButton power;
    private JButton health;
    private JButton drops;
    private JPanel buttonPanel;
    public Upgrade(Player pika)
    {
       speed= new JButton("Speed");
       power = new JButton("Power");
       health = new JButton("Health");
       drops = new JButton("Drops");
      // test = new JButton("Test");
       buttonPanel = new JPanel();
       buttonPanel.add(speed);
       buttonPanel.add(power);
       buttonPanel.add(health);
       buttonPanel.add(drops);
       //this.add(speed);
      // this.add(power);
      // this.add(health);
      // this.add(drops);
        
        
        this.add(buttonPanel, BorderLayout.SOUTH);
        pikachu=pika;
        

    }

    public void paintComponent(Graphics page)
    {   
        
        
        
        //buttonPanel.add(new infoPanel(health,gold));
        
        buttonPanel.setVisible(true);
        this.setLayout(new BorderLayout());
        super.paintComponent(page);
        this.setOpaque(true);
        page.setColor(Color.red);
        this.setBackground(Color.red);
       //test.addActionListener(new action());

        repaint();

    }
    private class action implements ActionListener
    {
        private String com;
        public void action(String command )
        {
            //creates upgrade window where you can upgrade Pikachu
            com=command;
            
        }
        
        
        
        public void actionPerformed(ActionEvent e)
        {
            //creates upgrade window where you can upgrade Pikachu
            if(com.equals("H"))
            pikachu.upgHealth();
            else if(com.equals("H"))
             pikachu.upgHealth();
            
            
            
            
        }
    }
}
