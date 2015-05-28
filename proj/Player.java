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
 * Class to create the Player object which will 
 * be the object the actual player controls
 * 
 * @author Aditya, Prahlad, Andrew, Go
 * @version 1.0
 */
public class Player extends Entity
{
    private int health;
    private int damage;
    private double speed;
    private BufferedImage play;
    private double x;
    private double y;
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
    private boolean pr;
    private boolean pu;
    public Player(int hp, int dmg, double spd, BufferedImage player, int positionX, int positionY)
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

    public double getSpeed()
    {
        return speed;
    }

    public double upgSpeed()
    {
        speed+=0.03;
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

        left=false;
        right=true;

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


        right=false;
        left=true;

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

        down=false;
        up=true;

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

        //  y+=10;
        up=false;
        down=true;

    }
    public void downn() {
        down=false;
    }

    public int getX(){
        if(right && !(x > 950)){
            x+=speed;
            pr=true;
        }
        if(left && !(x <= 175)){
            x-=speed;
            pr=false;
        }
        return (int)x;
    }

    public int getY(){
        if(up && !(y < 200)){
            pu=true;
            y-=speed;
        }
        if(down && !(y > 725)){
            pu=false;
            y+=speed;
        }

        return (int)y;
    }

    public void setX(int xp){
        x= xp;
    }

    public void setY(int yp){
        y = yp;
    }
    
    public boolean shootr(){
        return pr;
    }
    
    public boolean shootu(){
        return pu;
    }
    
   // public void W() {
   //     proj=new StandardEnemy(100,0,50,ImageIO.read(new File("r3.png")),300,300,Math.random() * (0.06 - 0.03)+.13);
   // }

    //public void A() {
    //   proj2=new StandardEnemy(100,0,50,ImageIO.read(new File("r3.png")),300,300,Math.random() * (0.06 - 0.03)+.13);
    // }
    //public void S() {
    //  proj3=new StandardEnemy(100,0,50,ImageIO.read(new File("r3.png")),300,300,Math.random() * (0.06 - 0.03)+.13);
    // }
    //public void D() {
    //    proj4=new StandardEnemy(100,0,50,ImageIO.read(new File("r3.png")),300,300,Math.random() * (0.06 - 0.03)+.13);
    //}

    // public void Wn() {
    //    down=false;
    //}
    //public void An() {
    //}
    // public void Sn() {
    //     down=false;
    // }
    // public void Dn() {
    //     down=false;
    //}

}
