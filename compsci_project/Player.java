
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
public class Player extends Entity
{
    // instance variables - replace the example below with your own
    BufferedImage pikachu;

    public Player(int s, int x, int y)
    {
        super(s,x,y);
    }

    public void setX(int x)
    {
        xPos=x;
    }

    public void setY(int y)
    {
        yPos=y;
    }

    public BufferedImage getPic()
    {
        if(getDirection()==Direction.DOWN)
        {
            try {
                pikachu=ImageIO.read(new File("d1.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
        }
        if(getDirection()==Direction.UP)
        {
            try {
                pikachu=ImageIO.read(new File("u1.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
        }
        if(getDirection()==Direction.LEFT)
        {
            try {
                pikachu=ImageIO.read(new File("l1.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
        }
        if(getDirection()==Direction.RIGHT)
        {
            try {
                pikachu=ImageIO.read(new File("r1.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
        }
        return pikachu;
    }
}
