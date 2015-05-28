// ******************************************************************
//   CirclePanel.java
//
//   A panel with a circle drawn in the center and buttons on the 
//   bottom that move the circle.
// ******************************************************************
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Upgrade extends JPanel
{
    public Upgrade()
    {
    }

    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        this.setOpaque(true);
        page.setColor(Color.red);
        this.setBackground(Color.red);
    }
}
