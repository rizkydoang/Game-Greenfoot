import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuh1 extends musuhh
{
    /**
     * Act - do whatever the musuh1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int shootingCounter = 10;
    public void act() 
    {
        shootingCounter --;
        shooting();
        move();
    }
    public boolean shooting()
    {
        if(shootingCounter <= 0)
        {
            getWorld().addObject(new pelorm1(), getX()+15, getY());
            shootingCounter = 120;
            return true;
        }
        return false;
    }
}
