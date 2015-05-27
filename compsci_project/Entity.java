import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public abstract class Entity
{
    
    private int speed;
    public int xPos,yPos;
    private BufferedImage picture;
    private Direction direction;
    public Entity( int s, int x, int y)
    {
        
        speed=s;
        xPos=x;
        yPos=y;
        direction=Direction.UP;
    }
   
    public Direction getDirection()
    {
        return direction;
    }
    public void setDirection(Direction d)
    {
        direction=d;
    }
   
    public  int getSpeed()
    {
        return speed;
    }
    public int getX()
    {
        return xPos;
    }
    public int getY()
    {
        return yPos;
    }
    public void setSpeed(int s)
    {
        speed=s;
    }
    public abstract BufferedImage getPic();
   
}
