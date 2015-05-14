
/**
 * Write a description of class FastEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FastEnemy extends Enemy
{
    private int health;
    private int damage;
    private int speed;
    public FastEnemy(int hp, int dmg, int spd)
    {
        health = hp;
        damage = dmg;
        speed = spd;
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
}
