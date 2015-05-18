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
 * Write a description of class Swordman here.
 * 
 * //WE ARE STARTING OFF BY ONLY DOING THE MAGE
 * ONLY IF WE HAVE TIME WILL WE DO THE OTHER CLASSES
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swordman extends Player
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Swordman
     */
    public Swordman(int hp, int dmg, int spd, BufferedImage picture)
    {
        // initialise instance variables
        super (hp,dmg,spd,picture);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
