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
    private Player pika;
    public Projectile(int xCord, int yCord, BufferedImage pic, Player play )
    {
        x=xCord;
        y=yCord;
        projectile=pic;
        pika=play;
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
    /*

    public int getX()
    {
        if (x<0 || x>1200)
           return (int)x;
        if (pika.shootr()){
            x+=1;
        }
        else{
            x-=1;
        }
        return (int)x;
    }
    */
   
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

   // public int getY()
   // {
        /* if (y<100 || y>700)
             return (int)y; 
         if (pika.shootu()){
            y-=1;
         }
        else{
            y+=1;
        }
        */
       
        //if(!(str==null))
          //  if(str.equals("RIGHT"))
          //     x+=inc;
          //  else if(str.equals("LEFT"))
          //      x-=inc;
        //change+=inc;
        //return (int)x;
   // }
   
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

        //return projectile;
    }
}
