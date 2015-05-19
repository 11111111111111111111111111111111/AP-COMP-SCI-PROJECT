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
public class Game extends JPanel
{
    private final int CIRCLE_SIZE = 50;
    private int xinc;
    private Color c;
    private JButton choose;
    private boolean up;
    private boolean down;
    private boolean upgrade;
    private boolean left;
    private boolean right;
    private Player pikachu;
    private Timer timer;
    private int health;
    private int gold;
    //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------
    public Game(int width, int height)
    {
        // Set coordinates so circle starts in middle
        
       
        health=10;
        gold=1000;

        c = Color.white;
        this.setLayout(new BorderLayout());
        JButton upgrade = new JButton("Upgrade");
        upgrade.addActionListener(new MoveListener());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(upgrade);
        buttonPanel.add(new infoPanel(health,gold));
        this.add(buttonPanel, BorderLayout.NORTH);
        JPanel colorPanel=new JPanel();
        //test player
        try {
            pikachu=new Player(100,0,1,ImageIO.read(new File("pika1.png")),400,300);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //---------------------------------------------------------------
    // Draw circle on CirclePanel
    //---------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        //green rect is where info for health, gold, etc. will be placed as text
        page.setColor(Color.green);
        page.fillRect(0,0, 1200,130);
        page.drawImage(pikachu.getPic(), 100, 100, this);
        repaint();
    }

    //---------------------------------------------------------------
    // Class to listen for button clicks that move circle.
    //---------------------------------------------------------------

    private class MoveListener implements ActionListener, KeyListener
    {
        //---------------------------------------------------------------
        // Parameters tell how to move circle at click.
        //---------------------------------------------------------------
        public MoveListener()
        {
        }
        //---------------------------------------------------------------
        // Change x and y coordinates and repaint.
        //---------------------------------------------------------------

        public void actionPerformed (ActionEvent e)
        {
            JFrame frame = new JFrame ("Upgrade");
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

            frame.setPreferredSize(new Dimension(200,200));
            frame.getContentPane().add(new Upgrade(500,500));

            frame.pack();
            frame.setVisible(true);
            repaint();
        }

        public void keyPressed(KeyEvent evt) {
            int z = evt.getKeyCode();
            switch (z) {
                case (KeyEvent.VK_DOWN):
                down=true;
                //y-=10;
                repaint();
                break;
                case(KeyEvent.VK_LEFT):
                upgrade=true;
                //x-=10;
                repaint();
                break;
                case(KeyEvent.VK_RIGHT):
                right=true;
                //x+=10;
                repaint();
                break;
                case(KeyEvent.VK_UP):
                up=true;
                //y+=10;
                repaint();
                break;
            }
        }

        public void keyReleased(KeyEvent evt) {
            int zz = evt.getKeyCode();
            switch (zz) {
                case(KeyEvent.VK_UP):     
                up=false;
                //xinc= 0;
                break;
                case(KeyEvent.VK_DOWN):
                down=false;
                //xinc = 0;
                break;
                case(KeyEvent.VK_LEFT):     
                upgrade=false;
                //xinc= 0;
                break;
                case(KeyEvent.VK_RIGHT):
                right=false;
                //xinc = 0;
                break;
            }

        }

        public void keyTyped(KeyEvent evt) {
            int z = evt.getKeyCode();
            switch (z) {
                case (KeyEvent.VK_DOWN):
                down=true;
                //y-=10;
                repaint();
                break;
                case(KeyEvent.VK_LEFT):
                upgrade=true;
                //x-=10;
                repaint();
                break;
                case(KeyEvent.VK_RIGHT):
                right=true;
                //x+=10;
                repaint();
                break;
                case(KeyEvent.VK_UP):
                up=true;
                //y+=10;
                repaint();
                break;
            }
        }
    }
}
