import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends JPanel implements ActionListener
{
    //ActionListener timerAction = new ActionListener();
    private int slimeX;
    private int slimeY;
    private int slimeSpeed;
    private Timer timer;
    
     public void Projectile()
    {
        timer=new Timer(13, this);
        timer.start();
        requestFocus();
        slimeSpeed=4;


    }
    public void actionPerformed(ActionEvent evt) {

        
            slimeX += slimeSpeed;
            slimeY += slimeSpeed;
            repaint();
        
    }
    
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);

        page.setColor(Color.red);
        //page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
    }

}
