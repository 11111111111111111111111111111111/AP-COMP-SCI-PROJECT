
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
public class Enemy
{
    // instance variables - replace the example below with your own
    private BufferedImage persian;
    private Player pikachu;
    private double speed;
    private int xcoor;
    private int ycoor;
    private int r;
    private int l;
    private int u;
    private int d;
    public Enemy(double s, int x, int y, Player p)
    {
        speed=s;
        xcoor=x;
        ycoor=y;
        pikachu=p;
        r=0;
        l=0;
        u=0;
        d=0;
    }
    public void setY()
    {
        if(pikachu.getY()<getY())
        {
            if(u==0)
            {
            try {
                persian=ImageIO.read(new File("u3.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
                u++;
            }
            if(u==1)
            {
            try {
                persian=ImageIO.read(new File("u4.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
                u--;
            }
            ycoor-=getSpeed();
        }
        if(pikachu.getY()>getY())
        {
            
            if(d==0)
            {
            try {
                persian=ImageIO.read(new File("d3.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
                d++;
            }
            if(d==1)
            {
            try {
                persian=ImageIO.read(new File("d4.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
                d--;
            }
            ycoor+=getSpeed();
        }
    }
    public void setX()
    {
        if(pikachu.getX()<getX())
        {
            if(r==0)
            {
            try {
                persian=ImageIO.read(new File("r3.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
                r++;
            }
            if(l==1)
            {
            try {
                persian=ImageIO.read(new File("r4.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
                r--;
            }
            xcoor-=getSpeed();
        }
        
        if(pikachu.getX()>getX())
        {
            if(l==0)
            {
            try {
                persian=ImageIO.read(new File("l3.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
                l++;
            }
            if(l==1)
            {
            try {
                persian=ImageIO.read(new File("l4.png"));
            }
            catch(IOException e)
            {
                e.printStackTrace();}
                l--;
            }
            xcoor+=getSpeed();
        }
    }

    public BufferedImage getPic()
    {
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
    
    public double getSpeed()
    {
        return speed;
    }
}