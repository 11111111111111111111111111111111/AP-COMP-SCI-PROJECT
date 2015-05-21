import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Game2 extends Applet implements KeyListener {
    private int xPos, yPos;
    private final int CIRCLE_SIZE = 50;
    private int xinc,yinc;
    private Color c;
    private boolean up;
    private boolean down;
    private boolean upgrade;
    private boolean left;
    private boolean right;
    private Player pikachu;
    private int health;
    private int gold;
    
    
    public void Game2(int width, int height) {
        
        health=10;
        gold=1000;
        
        setBackground(Color.white);
        xPos = 500;
        yPos = 500;
        
        try {
            pikachu=new Player(100,0,1,ImageIO.read(new File("pika1.png")),40,300);
        } catch (IOException e) {
            e.printStackTrace();
        }
        addKeyListener(this);
        requestFocus();
    }

    public void paint(Graphics page) {
         page.setColor(Color.green);
        page.fillRect(0,0, 1200,130);
        if(right){
            xinc = 1;
            xPos+= 4*xinc;
        }
        else if (!right){
            xinc= 0; 
        }
        if(left){
            xinc= -1;
            xPos+= 4*xinc;
        }
        else if (!left){
            xinc= 0; 
        }
        if(up){
            yinc = 1;
            yPos+= 4*yinc;
        }
        else if (!up){
            yinc= 0; 
        }
        if(down){
            yinc= -1;
            yPos+= 4*yinc;
        }
        else if (!down){
            yinc= 0; 
        }
        page.fillRect(xPos,yPos,50,50);
        
        page.drawImage(pikachu.getPic(), xPos, yPos, this);
        repaint();
    }
    
     public void actionPerformed (ActionEvent e)
        {
           // frame.setPreferredSize(new Dimension(200,200));
           // frame.getContentPane().add(new Upgrade(500,500));

           // frame.pack();
           // frame.setVisible(true);
            repaint();
        }

    public void keyPressed(KeyEvent evt) {
           int z = evt.getKeyCode();
        switch (z) {
            case (KeyEvent.VK_UP):
            up=true;
           // yPos -= 10;
            break;
            case (KeyEvent.VK_DOWN):
            down=true;
            //xinc=0;
            break;
            case(KeyEvent.VK_LEFT):
            left=true;
            //xinc= -1;
            // xPos+= 5*xinc;
            break;
            case(KeyEvent.VK_RIGHT):
            right=true;
            //xinc = 1;
            // xPos+= 5*xinc;
            break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent evt) {
          int z = evt.getKeyCode();
        switch (z) {
            case (KeyEvent.VK_UP):
            up=false;
           // yPos -= 10;
            break;
            case (KeyEvent.VK_DOWN):
            down=false;
            //xinc=0;
            break;
            case(KeyEvent.VK_LEFT):
            left=false;
            //xinc= -1;
            // xPos+= 5*xinc;
            break;
            case(KeyEvent.VK_RIGHT):
            right=false;
            //xinc = 1;
            // xPos+= 5*xinc;
            break;
        }
        repaint();
    }

    public void keyTyped(KeyEvent evt) {
    }
    
    
}