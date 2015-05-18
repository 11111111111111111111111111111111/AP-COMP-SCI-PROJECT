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
 * Write a description of class Archer here.
 * 
 * //WE ARE STARTING OFF BY ONLY DOING THE MAGE
 * ONLY IF WE HAVE TIME WILL WE DO THE OTHER CLASSES
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archer extends Player
{
    // instance variables - replace the example below with your own
    public Archer(int hp, int dmg, int spd, BufferedImage player)
    {
        // initialise instance variables
        super(hp,dmg,spd, player);
    }

}
