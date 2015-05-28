import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile
{
   private double x;
   private double y;
   private double inc;
   private boolean range;
   private double change;
   private String str;
   private BufferedImage projectile;
   
   public Projectile(int xCord, int yCord, BufferedImage pic)
   {
       x=xCord;
       y=yCord;
       projectile=pic;
       inc=0.5;
    }
   
   public void setX(int xCord)
   {
       x=xCord;
       
    }
   public void setY(int yCord)
   {
       y=yCord;
   }
   
   public void setDir(String str1)
   {
       str=str1;
       change=0;
       range=true;
   }
   
   public int getX()
   {
       if(!(str==null))
        if(str.equals("RIGHT"))
        x+=inc;
        else if(str.equals("LEFT"))
        x-=inc;
        change+=inc;
        return (int)x;
    }
   public int getY()
   {
       if(!(str==null))
        if(str.equals("DOWN"))
        y+=inc;
        else if(str.equals("UP"))
        y-=inc;
        change+=inc;
        return (int)y;
    }
   public BufferedImage getPic()
   { 
       if(change>=300)
       range=false;
       
       if(range)
       return projectile;
       
       return null;
    }
}
