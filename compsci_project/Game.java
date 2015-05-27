import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;
public class Game extends JPanel 
{
    private List<Enemy> persians; 
    private Player pikachu;
    private Timer timer;
    private BufferedImage background;
    int delay;
  
    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
   
    private static final String DOWN = "DOWN";
    private static final String UP = "UP";
    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    public Game()
    {

        
        //c = Color.white;
        this.setLayout(new BorderLayout());
        

        JPanel buttonPanel = new JPanel();
      
        this.add(buttonPanel, BorderLayout.NORTH);
        

        pikachu=new Player(100,600,400);
        persians= new ArrayList<Enemy>();
        
        
       
        persians.add(new Enemy(1,(int)(Math.random()*1200), 500-(int) (Math.random()*370), pikachu));
          
        
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("DOWN"), DOWN);
        buttonPanel.getActionMap().put(DOWN, new MoveDown());
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), UP);
        buttonPanel.getActionMap().put(UP, new MoveUp());
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("LEFT"), LEFT);
        buttonPanel.getActionMap().put(LEFT, new MoveLeft());
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("RIGHT"), RIGHT);
        buttonPanel.getActionMap().put(RIGHT, new MoveRight());
        delay=10000;
        ActionListener taskPerformer = new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    persians.add(new Enemy(1,(int)(Math.random()*1200), 500-(int) (Math.random()*370), pikachu));
                    repaint();
                }
            };
        new Timer(delay, taskPerformer).start();
      
       
        try{
            background=ImageIO.read(new File("stadium.png"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    

    //---------------------------------------------------------------
    // Repaint the game
    //---------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
        // super.paintComponent(page);
        //green rect is where info for health, gold, etc. will be placed as text
        page.setColor(Color.green);
        page.fillRect(0,0, 1200,130);
        page.setColor(Color.black);
        page.fillRect(0,130,1200,670);
       //  page.drawImage(background, 100, 125, this);
        page.drawImage(pikachu.getPic(), pikachu.getX(), pikachu.getY(), this);
        for(Enemy enemy: persians)
        {
            enemy.setY();
            enemy.setX();
            page.drawImage(enemy.getPic(),enemy.getX(), enemy.getY(),this);
        }
        repaint();
    }
    
    private class MoveDown extends AbstractAction
    {
       
        public void actionPerformed(ActionEvent e)
        {
            pikachu.setY(pikachu.getY()+pikachu.getSpeed());
             pikachu.setDirection(Direction.DOWN);
            
        }
        
    }
    private class MoveLeft extends AbstractAction
    {
       
        public void actionPerformed(ActionEvent e)
        {
            pikachu.setX(pikachu.getX()-pikachu.getSpeed());
            pikachu.setDirection(Direction.LEFT);
        }
        
    }
    private class MoveRight extends AbstractAction
    {
       
        public void actionPerformed(ActionEvent e)
        {
            pikachu.setX(pikachu.getX()+pikachu.getSpeed());
            pikachu.setDirection(Direction.RIGHT);
        }
        
    }
    private class MoveUp extends AbstractAction
    {
       
       
        public void actionPerformed(ActionEvent e)
        {
            pikachu.setY(pikachu.getY()-pikachu.getSpeed());
            pikachu.setDirection(Direction.UP);
        }
        
    }
}               


