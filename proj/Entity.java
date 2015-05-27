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
 * Abstract class Entity- Parent class for all moving entities such 
 *                          as player or enemies
 * 
 * @author Aditya, Prahlad, Andrew, Go
 * @version 1.0
 */
public abstract class Entity
{
    private int health;
    private int damage;
    private int speed;
    private int x,y;
    private BufferedImage picture;
    public abstract int getDamage();
    public abstract int getHealth();
    public abstract int decreaseHealth();
    public abstract int getSpeed(); 
    public abstract BufferedImage getPic();
}
