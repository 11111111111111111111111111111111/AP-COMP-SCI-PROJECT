
/**
 * Abstract class Enemy - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Entity
{
    private int health;
    private int damage;
    private int speed;
    
    public abstract int getDamage();
    public abstract int getHealth();
    public abstract int decreaseHealth();
    public abstract int getSpeed();     
}
