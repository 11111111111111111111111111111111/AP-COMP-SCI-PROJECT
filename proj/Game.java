// ******************************************************************
//   CirclePanel.java
//
//   A panel with a circle drawn in the center and buttons on the 
//   bottom that move the circle.
// ******************************************************************
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
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
    }

    //---------------------------------------------------------------
    // Draw circle on CirclePanel
    //---------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);

        page.setColor(Color.green);
        page.drawLine(0,100, 1000,0);
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
        public void actionPerformed(ActionEvent e)
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
