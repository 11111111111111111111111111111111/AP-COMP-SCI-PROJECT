import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class Player here.
 * 
 * 
 * //WE ARE STARTING OFF BY ONLY DOING THE MAGE
 * ONLY IF WE HAVE TIME WILL WE DO THE OTHER CLASSES
 * 
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Entity
{
    private int health;
    private int damage;
    private int speed;
    public Player(int hp, int dmg, int spd)
    {
        health = hp;
        damage = dmg;
        speed = spd;
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
    
    
    
}
