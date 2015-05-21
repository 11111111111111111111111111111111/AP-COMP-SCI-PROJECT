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
public class Game extends JFrame
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
     private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
            private static final String FIRE = "player fire";
            //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------   
    static JLabel obj1 = new JLabel("hello");
    public Game(int width, int height)
    {
        // Set coordinates so circle starts in middle




         //    Do all the layout management and what not...
        //Container c = this.getContentPane();
        //c.setLayout(new FlowLayout());
       // c.add(obj1);

        //      ...
        //obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("T"), FIRE);
        //obj1.getActionMap().put(FIRE, new FireAction(1));
        

       
        health=10;
        gold=1000;

        //c = Color.white;
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
            pikachu=new Player(100,0,1,ImageIO.read(new File("pika1.png")),40,300);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //---------------------------------------------------------------
    // Draw circle on CirclePanel
    //---------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
       // super.paintComponent(page);
        //green rect is where info for health, gold, etc. will be placed as text
        page.setColor(Color.green);
        page.fillRect(0,0, 1200,130);
        page.drawImage(pikachu.getPic(), pikachu.getX(), pikachu.getY(), this);
        repaint();
    }

    //---------------------------------------------------------------
    // Class to listen for button clicks that move circle.
    //---------------------------------------------------------------

    private class MoveListener implements ActionListener
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

       
    }
}
