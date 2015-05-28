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
   private String str;
   private BufferedImage projectile;
   private Player pika;
   public Projectile(int xCord, int yCord, BufferedImage pic, Player play )
   {
       x=xCord;
       y=yCord;
       projectile=pic;
       pika=play;
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
   }
   
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
   public int getY()
   {
       if (y<100 || y>700)
       return (int)y; 
       if (pika.shootu()){
            y-=1;
        }
        else{
        y+=1;
        }
        return (int)y;
    }
   public BufferedImage getPic()
   {
       return projectile;
    }
}
