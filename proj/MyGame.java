import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MyGame extends JFrame {

    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    private static final String FIRE = "player fire";

    static JLabel obj1 = new JLabel("hello");
    public MyGame() {

        //      Do all the layout management and what not...

        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(obj1);

        //      ...
        obj1.getInputMap(IFW).put(KeyStroke.getKeyStroke("T"), FIRE);
        obj1.getActionMap().put(FIRE, new FireAction(1));

    }

    //    static void rebindKey(KeyEvent ke, String oldKey) {
    // 
    //         //      Depends on your GUI implementation.
    //         //      Detecting the new key by a KeyListener is the way to go this time.
    //         obj1.getInputMap(IFW).remove(KeyStroke.getKeyStroke(oldKey));
    //         //      Removing can also be done by assigning the action name "none".
    //         obj1.getInputMap(IFW).put(KeyStroke.getKeyStrokeForEvent(ke),
    //             ob j1.getInputMap(IFW).get(KeyStroke.getKeyStroke(oldKey)));
    //         //      You can drop the remove action if you want a secondary key for the action.
    //     }

    public static void main(String[] args) {
        MyGame mg =new MyGame();
        mg.setVisible(true);
    }

    private class FireAction extends AbstractAction {
        int player;
        FireAction(int player) {
            this.player = player;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            obj1.setText(player + " FIRED");
        }
    }
}
