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
   
   public Projectile(int xCord, int yCord, BufferedImage pic )
   {
       x=xCord;
       y=yCord;
       projectile=pic;
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
        return (int)x;
    }
   public int getY()
   {
        return (int)y;
    }
   public BufferedImage getPic()
   {
       return projectile;
    }
}
