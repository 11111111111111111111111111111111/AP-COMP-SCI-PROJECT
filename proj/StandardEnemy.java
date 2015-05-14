
/**
 * Write a description of class StandardEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandardEnemy extends Enemy
{
    private int health;
    private int damage;
    private int speed;
    public StandardEnemy(int hp, int dmg, int spd)
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
