
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
public class Enemy
{
    // instance variables - replace the example below with your own
    private BufferedImage persian;
    private Player pikachu;
    private Direction direction;
    private double speed;
    private int xcoor;
    private int ycoor;
    public Enemy(double s, int x, int y, Player p)
    {
        speed=s;
        xcoor=x;
        ycoor=y;
        pikachu=p;
        direction=Direction.UP;
    }
    public void setY()
    {
        if(pikachu.getY()<getY())
        {
            setDirection(Direction.UP);
            ycoor-=getSpeed();
        }
        if(pikachu.getY()>getY())
        {
            setDirection(Direction.DOWN);
            ycoor+=getSpeed();
        }
    }
    public void setX()
    {
        if(pikachu.getX()<getX())
        {
            setDirection(Direction.LEFT);
            xcoor-=getSpeed();
        }
        if(pikachu.getX()>getX())
        {
            setDirection(Direction.RIGHT);
            xcoor+=getSpeed();
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
    
    public int getY()
    {
        return ycoor;
    }
    
    public int getX()
    {
        return xcoor;
    }
    
    public Direction getDirection()
    {
        return direction;
    }
    
    public void setDirection(Direction d)
    {
        direction=d;
    }
    
    public double getSpeed()
    {
        return speed;
    }
}