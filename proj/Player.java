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
    private double x;
    private double y;
    private double inc;
    //position of picture
    private double xpic;
    private double ypic;
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
    private int r;
    private int l;
    private int u;
    private int d;
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
        r=0;
        d=0;
        u=0;
        l=0;
        inc=0.05;
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
        if (r==0){
            try{
                    play=ImageIO.read(new File("r1.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
                r++;
        }
        else {
            try{
                    play=ImageIO.read(new File("r2.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
            r=0;
        }
        if( x > 1150){
            //x += 0;
            right=false;
        }
        else{
            //x+=10;
            left=false;
            right=true;
        }
    }
    
    public void rightn() {
        right=false;
    }
    
    
    public void left() {
        if (l==0){
            try{
                    play=ImageIO.read(new File("l1.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
                l++;
        }
        else {
            try{
                    play=ImageIO.read(new File("l2.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
            l=0;
        }
        if( x <= 0){
            //x +=0;
            left=false;
        }
        else{
            //x-=10;
            right=false;
            left=true;

        }
    }
    public void leftn() {
        left=false;
    }
    
    
    public void up() {
        if (u==0){
            try{
                    play=ImageIO.read(new File("u1.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
                u++;
        }
        else {
            try{
                    play=ImageIO.read(new File("u2.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
            u=0;
        }
        try{
        play=ImageIO.read(new File("up.gif"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        if(y < 150){
            //y += 0;
            up=false;
        }
        else{
            //y-=10;
            down=false;
            up=true;
        }
    }
    public void upn() {
        up=false;
    }
    
     public void run() {
        y-=10;
    }
    
    
    public void down() {
        if (d==0){
            try{
                    play=ImageIO.read(new File("d1.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
                d++;
        }
        else {
            try{
                    play=ImageIO.read(new File("d2.png"));
                }
            catch (IOException e) {
                    e.printStackTrace();
                }
            d=0;
        }
        try{
        play=ImageIO.read(new File("down.gif"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        if(y > 725){
           // y += 0;
           down=false;
        }
        else{
          //  y+=10;
          up=false;
          down=true;
        }
    }
    public void downn() {
        down=false;
    }
    
    public int getX(){
        if(right & !(x > 1150)){
            x+=inc;
        }
        if(left & !(x <= 0)){
            x-=inc;
        }
        return (int)x;
    }
    
    public int getY(){
        if(up && !(y < 100)){
            y-=inc;
        }
        if(down && !(y > 725)){
            y+=inc;
        }
        
       return (int)y;
    }
    
    
    public void setX(int xp){
        x= xp;
    }
    
    public void setY(int yp){
       y = yp;
    }
}
