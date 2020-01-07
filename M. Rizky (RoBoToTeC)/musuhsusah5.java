import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuhsusah5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuhsusah5 extends musuhh
{
    /**
     * Act - do whatever the musuhsusah5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int shootingCounter = 10;
    private int direction = 1; 
    public void act() 
    {
        int x = getX();
        int y = getY();
        shootingCounter --;
        shooting();
        setLocation(x-5,y);
        if(x <= 1){
           setLocation(getWorld().getWidth(),y);
        }
    } 
        public boolean shooting()
    {
        if(shootingCounter <= 0 && direction ==1)
        {
            getWorld().addObject(new pelorm3(), getX(), getY());
            shootingCounter = 50;
            return true;
        }
        return false;
    }
}
