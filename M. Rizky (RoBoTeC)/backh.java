import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backh extends tombol
{
    /**
     * Act - do whatever the backh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            ((help)getWorld()).stopped();
            World Start = getWorld();
            Start = new menu();
            Greenfoot.setWorld(Start);
        }
    }    
}
