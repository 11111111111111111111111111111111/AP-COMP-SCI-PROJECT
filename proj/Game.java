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
    private int x,y;
    private Color c;
    private JButton choose;
    private boolean up;
    private boolean down;
    private boolean upgrade;
    private boolean right;
    private Player pikachu;
    //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------
    public Game(int width, int height)
    {
        // Set coordinates so circle starts in middle
        x = (width/2)-(CIRCLE_SIZE/2);
        y = (height/2)-(CIRCLE_SIZE/2); 

        c = Color.white;
        this.setLayout(new BorderLayout());
        JButton upgrade = new JButton("Upgrade");
        upgrade.addActionListener(new MoveListener());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(upgrade);
        this.add(buttonPanel, BorderLayout.NORTH);
        JPanel colorPanel=new JPanel();
        //test player
        try {
            pikachu=new Mage(100,0,1,ImageIO.read(new File("pika.png")));
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

        page.setForeground(Color.green);
        page.drawLine(0,100, 1000,0);
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
        //ActionListener timerAction = new ActionListener();
        public MoveListener()
        {
        }
        
        /*public void actionPerformed(ActionEvent evt) {

            if(evt.getSource() == moveSlimeBall){
                slimeX += slimeXSpeed;
                slimeY += slimeYSpeed;
                repaint();
            }
        }*/

        
        //---------------------------------------------------------------
        // Change x and y coordinates and repaint.
        //---------------------------------------------------------------
        
        public void actionPerformed (ActionEvent e)
        {
            JFrame frame = new JFrame ("Upgrade");
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setPreferredSize(new Dimension(200,200));
            /*Timer moveSlimeBall = new Timer(10 , e);
             if(evt.getSource() == moveSlimeBall){
                slimeX += slimeXSpeed;
                slimeY += slimeYSpeed;
                repaint();
            }*/
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
                break;
                case(KeyEvent.VK_LEFT):
                upgrade=true;
                //xinc= -1;
                // xPos+= 5*xinc;
                break;
                case(KeyEvent.VK_RIGHT):
                right=true;
                //xinc = 1;
                // xPos+= 5*xinc;
                break;
                case(KeyEvent.VK_UP):
                up=true;
                //xinc = 1;
                // xPos+= 5*xinc;
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
        }
    }

    private class ColorListener implements ActionListener
    {
        private Color a;
        private JColorChooser g;
        public ColorListener(Color a){
            this.a=a;
            g=new JColorChooser();
        }

        public void actionPerformed(ActionEvent e)
        {
            if (a==null){
                c=g.showDialog(choose, "Colors", c);
            }
            else
                c=a;
            repaint();

        }

    }
}
