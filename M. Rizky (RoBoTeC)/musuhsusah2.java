import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuhsusah2 extends musuhh
{
    /**
     * Act - do whatever the musuh3 wants to do. This method is called whenever
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
            getWorld().addObject(new pelorm2(), getX()+15, getY());
            getWorld().addObject(new pelorm2(), getX()+15, getY()+25);
            shootingCounter = 70;
            return true;
        }
        return false;
    }
}
