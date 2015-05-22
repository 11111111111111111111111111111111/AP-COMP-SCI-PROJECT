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
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Entity
{
    private int health;
    private int damage;
    private int speed;
    private BufferedImage play;
    private int x;
    private int y;
    //position of picture
    private double xpic;
    private double ypic;
    
    public Player(int hp, int dmg, int spd, BufferedImage player, int positionX, int positionY)
    {
        health = hp;
        damage = dmg;
        speed = spd;
        
        
        play=player;
        x=positionX;
        y=positionY;
        xpic=positionX;
        ypic=positionY;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int upgDamage()
    {
        damage+=5;
        return damage;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int upgHealth()
    {
        health+=5;
        return health;
    }
    
    public int decreaseHealth(){
        return health - 10;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
     public int upgSpeed()
    {
        speed+=5;
        return speed;
    }
    
    public BufferedImage getPic(){
        return play;
    }
    
    public void right() {
        try{
        play=ImageIO.read(new File("right.gif"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        if( x > 1150){
            x += 0;
        }
        else{
            x+=10;
        }
    }
    
    
    public void left() {
        try{
        play=ImageIO.read(new File("left.gif"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        if( x <= 0){
            x +=0;
        }
        else{
            x-=10;
        }
    }
    
    
    public void up() {
        try{
        play=ImageIO.read(new File("up.gif"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        if(y < 100){
            y += 0;
        }
        else{
            y-=10;
        }
    }
    
     public void run() {
        y-=10;
    }
    
    
    public void down() {
        try{
        play=ImageIO.read(new File("down.gif"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        if(y > 725){
            y += 0;
        }
        else{
            y+=10;
        }
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
       return y;
    }
    
    public int getXpic()
    {
       if(xpic<x-3)
            xpic+=.5;
        else if(xpic>x+3)
           xpic-=.5;
        return (int)xpic;
    }
    
    public int getYpic()
    {
        if(ypic<y-3)
            ypic+=.5;
        else if(ypic>y+3)
           ypic-=.5;
        return (int)ypic;
    }
    
    public void setX(int xp){
        x= xp;
    }
    
    public void setY(int yp){
       y = yp;
    }
}
