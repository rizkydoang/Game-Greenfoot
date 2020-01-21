import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuhsusah3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuhsusah3 extends musuhh
{
    /**
     * Act - do whatever the musuhsusah3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(x-6,y);
        if(x <= 1){
           setLocation(getWorld().getWidth(),y);
        }
    }    
}
