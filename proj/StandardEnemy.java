
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
    private int x;
    private int y;
    private BufferedImage enemy;
    public StandardEnemy(int hp, int dmg, int spd, int positionX, int positionY, BufferedImage image)
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
    
    public int getSpeed()
    {
        return speed;
    }
    public BufferedImage getPic(){
        return enemy;
    }
    
    
}
