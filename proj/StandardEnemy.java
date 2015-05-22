
/**
 * Write a description of class StandardEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
public class StandardEnemy extends Entity
{
    private int health;
    private int damage;
    private int speed;
    private double x;
    private double y;
    private BufferedImage enemy;
    public StandardEnemy(int hp, int dmg, int spd, BufferedImage image ,int positionX, int positionY )
    {
        health = hp;
        damage = dmg;
        speed = spd;
        x=positionX;
        y=positionY;
        enemy=image;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int decreaseHealth(){
        return health - 10;
    }
    
    public int getX(int playerX)
    {
       if(x<playerX-30)
            x+=0.05;
        else if(x>playerX+30)
           x-=0.05;
        return (int)x;
    }
    
    public int getY(int playerY)
    {
        if(y<playerY-35)
            y+=0.05;
        else if(y>playerY+35)
           y-=0.05;
        return (int)y;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    public BufferedImage getPic(){
        return enemy;
    }
    
    
}
