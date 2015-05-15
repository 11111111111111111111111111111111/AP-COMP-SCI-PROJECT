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
 * Write a description of class mage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mage extends Player
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class mage
     */
    public Mage(int hp, int dmg, int spd, BufferedImage player)
    {
        // initialise instance variables
        super(hp,dmg,spd, player);
    }
    
    public void shoot(int x, int y, boolean up, boolean right){
        Projectile projec= new Projectile();
        
        
    }
    
    public void aoe(int x, int y){
        
        
        
    }
    
    
    

   
}
