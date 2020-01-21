import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class helpp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class helpp extends tombol
{
    /**
     * Act - do whatever the helpp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            ((menu)getWorld()).stopped();
            World Start = getWorld();
            Start = new help();
            Greenfoot.setWorld(Start);
        }
    }    
}
