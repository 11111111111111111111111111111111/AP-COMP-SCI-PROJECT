
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
    private double inc;
    private BufferedImage enemy;
    private int r;
    public StandardEnemy(int hp, int dmg, int spd, BufferedImage image ,int positionX, int positionY, double ince )
    {
        health = hp;
        damage = dmg;
        speed = spd;
        x=positionX;
        y=positionY;
        enemy=image;
        r=0;
        inc= ince;
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
       if(x<playerX-30){
            x+=inc;
            if (r==0){
            try{
                    enemy=ImageIO.read(new File("r3.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
                r++;
        }
        else {
            try{
                    enemy=ImageIO.read(new File("r4.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
            r=0;
        }
            
        }
        else if(x>playerX+30){
           x-=inc;
           
        }
        return (int)x;
    }
    
    public int getY(int playerY)
    {
        if(y<playerY-35)
            y+=inc;
        else if(y>playerY+35)
           y-=inc;
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
