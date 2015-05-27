
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
public class Enemy extends Entity
{
    // instance variables - replace the example below with your own
    BufferedImage persian;
    Player pikachu;

    public Enemy(int s, int x, int y, Player p)
    {
        super(s,x,y);
        pikachu=p;
    }
    public void setY()
    {
        if(pikachu.getY()<getY())
        {
            setDirection(Direction.UP);
            yPos-=getSpeed();
        }
        if(pikachu.getY()>getY())
        {
            setDirection(Direction.DOWN);
            yPos+=getSpeed();
        }
    }
    public void setX()
    {
        if(pikachu.getX()<getX())
        {
            setDirection(Direction.LEFT);
            xPos-=getSpeed();
        }
        if(pikachu.getX()>getX())
        {
            setDirection(Direction.RIGHT);
            xPos+=getSpeed();
        }
    }

    public BufferedImage getPic()
    {
        if(getDirection()==Direction.DOWN)
        {
            try {
                persian=ImageIO.read(new File("d3.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
        }
        if(getDirection()==Direction.UP)
        {
            try {
                persian=ImageIO.read(new File("u3.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
        }
         if(getDirection()==Direction.LEFT)
        {
            try {
                persian=ImageIO.read(new File("l3.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
        }
         if(getDirection()==Direction.RIGHT)
        {
            try {
                persian=ImageIO.read(new File("r3.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
        }
        return persian;
    }
}
