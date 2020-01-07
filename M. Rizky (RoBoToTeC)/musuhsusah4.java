import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuhsusah4 extends musuhh
{
    /**
     * Act - do whatever the musuh3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 3;
    private int upTurn = 299;
    private int downTurn = 380;
    private int shootingCounter = 10;
    private int direction = 1; 
    public void act() 
    {
        shootingCounter --;
        shooting();
        setLocation ( getX() , getY() + speed );
        Actor actor = getOneIntersectingObject(null);
        if(actor != null) {
            actor.setLocation ( actor.getX(), actor.getY() + speed );
        }
        if (atTurningPoint()) {
            speed = -speed;
        }
    }
    public boolean shooting()
    {
        if(shootingCounter <= 0 && direction ==1)
        {
            getWorld().addObject(new pelorm2(), getX()+15, getY());
            getWorld().addObject(new pelorm2(), getX()+15, getY()+35);
            getWorld().addObject(new pelorm2(), getX()+15, getY()+70);
            shootingCounter = 70;
            return true;
        }
        return false;
    }
    /**
     * Test if we are at one of the turning points.
     */
    public boolean atTurningPoint()
    {
        return (getY() <= upTurn || getY() >= downTurn);
    }
}
