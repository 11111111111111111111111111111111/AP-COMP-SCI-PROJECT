
/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends JPanel implements ActionListener
{

    public void actionPerformed(ActionEvent evt) {
        ActionListener timerAction = new ActionListener()
        Timer moveSlimeBall = new Timer(10 , timerAction);

        if(evt.getSource() == moveSlimeBall){
            slimeX += slimeXSpeed;
            slimeY += slimeYSpeed;
            repaint();
        }
    }
    
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);

        page.setColor(Color.red);
        //page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
    }

}
