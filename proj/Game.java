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
import sun.audio.*;
import  sun.audio.ContinuousAudioDataStream;
import  java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Class where all elements of the game are brought together
 * 
 * @author Aditya, Prahlad, Andrew, Go
 * @version 1.0
 */
public class Game extends JPanel
{
    private Player pikachu;
    private List<Enemy> persians; 
    private int score;
    private int delay;
    private JButton diff;
    private BufferedImage background;
    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    private static final String DOWN = "DOWN";
    private static final String UP = "UP";
    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    private static final String DOWNn = "DOWNn";
    private static final String UPn = "UPn";
    private static final String LEFTn = "LEFTn";
    private static final String RIGHTn = "RIGHTn";
    private boolean run;
    public Game(int width, int height)
    {
        score=0;
        
        this.setLayout(new BorderLayout());
        diff = new JButton("Reset");
        diff.addActionListener(new ClickListener());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(diff);
        buttonPanel.add(new infoPanel(score));
        this.add(buttonPanel, BorderLayout.NORTH);

        //test player
        pikachu=new Player(0.5,600,400);
        persians= new ArrayList<Enemy>();
        try {
            //background=ImageIO.read(new File("stadium.png"));
            //pikachu=new Player(100,0,0.1,ImageIO.read(new File("r1.png")),600,300);
            //enemy=new StandardEnemy(100,0,50,ImageIO.read(new File("r3.png")),50,50,Math.random() * (0.06 - 0.03)+.08);
            //enemy1=new StandardEnemy(100,0,50,ImageIO.read(new File("r3.png")),5,5,Math.random() * (0.06 - 0.03)+.08);
            //enemy2=new StandardEnemy(100,0,50,ImageIO.read(new File("r3.png")),300,300,Math.random() * (0.06 - 0.03)+.08);

            InputStream in = new FileInputStream("music.wav");
            AudioStream as= new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (IOException e) {
            //e.printStackTrace();
        }

        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("pressed DOWN"), DOWN);
        buttonPanel.getActionMap().put(DOWN, new Move(DOWN));
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("pressed UP"), UP);
        buttonPanel.getActionMap().put(UP, new Move(UP));
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("pressed LEFT"), LEFT);
        buttonPanel.getActionMap().put(LEFT, new Move(LEFT));
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("pressed RIGHT"), RIGHT);
        buttonPanel.getActionMap().put(RIGHT, new Move(RIGHT));
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("released DOWN"), DOWNn);
        buttonPanel.getActionMap().put(DOWNn, new Move(DOWNn));
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("released UP"), UPn);
        buttonPanel.getActionMap().put(UPn, new Move(UPn));
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("released LEFT"), LEFTn);
        buttonPanel.getActionMap().put(LEFTn, new Move(LEFTn));
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("released RIGHT"), RIGHTn);
        buttonPanel.getActionMap().put(RIGHTn, new Move(RIGHTn));
        delay=5000;
        
        ActionListener taskPerformer = new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    persians.add(new Enemy(0.3,(int)(Math.random()*1200), 500-(int) (Math.random()*370), pikachu));
                    repaint();
                }
            };
        new Timer(delay, taskPerformer).start();
        
    }

    public void paintComponent(Graphics page)
    {
        // super.paintComponent(page);
        //green rect is where info for health, gold, etc. will be placed as text
        run=true;
        page.setColor(Color.green);
        page.fillRect(0,0, 1200,130);
        page.setColor(Color.black);
        page.fillRect(0,130,1200,670);
        //page.drawImage(background, 100, 125, this);
        page.drawImage(pikachu.getPic(), pikachu.getX(), pikachu.getY(), this);
        for(Enemy enemy: persians)
        {
            enemy.setY();
            enemy.setX();
            page.drawImage(enemy.getPic(),enemy.getX(), enemy.getY(),this);
            if(enemy.getX()==pikachu.getX() && enemy.getY()==pikachu.getY())
            {
                page.setColor(Color.RED);
                page.drawString("Score: "+score,500,500);
                page.drawString("GAME OVER",600,600);
                run=false;
                
            }
        }
        if(run)
        repaint();
    }
    
    private class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //When clicked, it refreshes game and has enemies start off a bit faster.
            run=true;
            repaint();
        }
    }
    
    private class Move extends AbstractAction
    {
        private String com;
        public Move(String command){
            com=command;
        }

        public void actionPerformed(ActionEvent e)
        {
            if(com.equals(DOWN))
                pikachu.down();
            else if(com.equals(LEFT))
                pikachu.left();
            else if(com.equals(RIGHT))
                pikachu.right();
            else if(com.equals(UP))
                pikachu.up();
            else if(com.equals(DOWNn))
                pikachu.downn();
            else if(com.equals(LEFTn))
                pikachu.leftn();
            else if(com.equals(RIGHTn))
                pikachu.rightn();
            else if(com.equals(UPn))
                pikachu.upn();
        }

    }
}

