// ******************************************************************
//   MoveCircle.java
//
//   Uses CirclePanel to display a GUI that lets the user move
//   a circle by pressing buttons.
// ******************************************************************

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame
{
    //-----------------------------------
    //  Set up a frame for the GUI.
    //-----------------------------------

    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    private static final String FIRE = "player fire";
    private static final String FIRE1 = "player add";

    static JLabel obj1 = new JLabel("hello");
    public GUI() {

        //      Do all the layout management and what not...

        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(obj1);

        //      ...
       // obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("T"), FIRE);
        //obj1.getActionMap().put(FIRE, new FireAction(1));
        //obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("C"), FIRE1);
        //obj1.getActionMap().put(FIRE1, apple(5));

    }

    //static void rebindKey(KeyEvent ke, String oldKey) {

    //      Depends on your GUI implementation.
    //      Detecting the new key by a KeyListener is the way to go this time.
    //  obj1.getInputMap(IFW).remove(KeyStroke.getKeyStroke(oldKey));
    //      Removing can also be done by assigning the action name "none".
    // obj1.getInputMap(IFW).put(KeyStroke.getKeyStrokeForEvent(ke),
    //    obj1.getInputMap(IFW).get(KeyStroke.getKeyStroke(oldKey)));
    //      You can drop the remove action if you want a secondary key for the action.
    // }

    public static void main(String[] args)
    {
        int hp=10;
        int gold=1000;
        JFrame frame = new JFrame ("Stay Alive");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1200,800));

        //frame.add(new Game(500,500));

        frame.pack();
        frame.setVisible(true);
    }
}