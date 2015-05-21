import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MyGame extends JFrame {

    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    private static final String FIRE = "player fire";
    private static final String FIRE1 = "player add";

    static JLabel obj1 = new JLabel("hello");
    public MyGame() {

        //      Do all the layout management and what not...

        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(obj1);
        
        //      ...
        obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("T"), FIRE);
        obj1.getActionMap().put(FIRE, new FireAction(1));
        obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("C"), FIRE1);
       // obj1.getActionMap().put(FIRE1, apple(5));

    }

    static void rebindKey(KeyEvent ke, String oldKey) {

        //      Depends on your GUI implementation.
        //      Detecting the new key by a KeyListener is the way to go this time.
        obj1.getInputMap(IFW).remove(KeyStroke.getKeyStroke(oldKey));
        //      Removing can also be done by assigning the action name "none".
        obj1.getInputMap(IFW).put(KeyStroke.getKeyStrokeForEvent(ke),
            obj1.getInputMap(IFW).get(KeyStroke.getKeyStroke(oldKey)));
        //      You can drop the remove action if you want a secondary key for the action.
    }

    public static void main(String[] args) {
        MyGame mg =new MyGame();
        mg.setVisible(true);
    }
    
    public void apple (int monkey) {
            player=player+monkey;
        }


    private class FireAction extends AbstractAction {

        int player;

        FireAction(int player) {
            this.player=player;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            obj1.setText(player + " FIRED");
        }
        
        public void apple (int monkey) {
            player=player+monkey;
        }
    }
}
