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
public class Player
{
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
    public Player(double spd, int positionX, int positionY)
    {
        speed=spd;
        try{
                play=ImageIO.read(new File("r1.png"));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        x=positionX;
        y=positionY;
        xpic=positionX;
        ypic=positionY;
        r=0;
        d=0;
        u=0;
        l=0;
    }

    public double getSpeed()
    {
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
        if(right && !(x > 1150)){
            x+=speed;
        }
        if(left && !(x <= 0)){
            x-=speed;
        }
        return (int)x;
    }

    public int getY(){
        if(up && !(y < 100)){
            y-=speed;
        }
        if(down && !(y > 750)){
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

}
