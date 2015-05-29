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
    private JButton test;
    private JPanel buttonPanel;
    public Upgrade(Player pika)
    {
       test = new JButton("Test");
       buttonPanel = new JPanel();
       buttonPanel.add(test);
        this.add(test);
        this.add(buttonPanel, BorderLayout.NORTH);
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
        test.addActionListener(new action());

        repaint();

    }
    private class action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //creates upgrade window where you can upgrade Pikachu
            pikachu.setX(0);
            
        }
    }
}
