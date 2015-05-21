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
    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    private static final String DOWN = "DOWN";
    private static final String UP = "UP";
    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    public Game(int width, int height)
    {
        // Set coordinates so circle starts in middle

        health=10;
        gold=1000;

        c = Color.white;
        this.setLayout(new BorderLayout());
        JButton upgrade = new JButton("Upgrade");
        //upgrade.addActionListener(new MoveListener());

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
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("DOWN"), DOWN);
        buttonPanel.getActionMap().put(DOWN, new MoveDown());
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), UP);
        buttonPanel.getActionMap().put(UP, new MoveUp());
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("LEFT"), LEFT);
        buttonPanel.getActionMap().put(LEFT, new MoveLeft());
        buttonPanel.getInputMap(IFW).put(KeyStroke.getKeyStroke("RIGHT"), RIGHT);
        buttonPanel.getActionMap().put(RIGHT, new MoveRight());
    }

    //---------------------------------------------------------------
    // Repaint the game
    //---------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        //green rect is where info for health, gold, etc. will be placed as text
        page.setColor(Color.green);
        page.fillRect(0,0, 1200,130);

        page.drawImage(pikachu.getPic(), pikachu.getX(), pikachu.getY(), this);
        repaint();
    }
    private class MoveDown extends AbstractAction
    {

        public void actionPerformed(ActionEvent e)
        {
            pikachu.down();
        }
    }
    private class MoveLeft extends AbstractAction
    {

        public void actionPerformed(ActionEvent e)
        {
            pikachu.left();
        }
    }
    private class MoveRight extends AbstractAction
    {

        public void actionPerformed(ActionEvent e)
        {
            pikachu.right();
        }
    }
    private class MoveUp extends AbstractAction
    {

        public void actionPerformed(ActionEvent e)
        {
            pikachu.up();
        }
    }



}

