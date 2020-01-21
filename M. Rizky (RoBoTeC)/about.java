import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class about here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class about extends tombol
{
    /**
     * Act - do whatever the about wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            ((menu)getWorld()).stopped();
            World Start = getWorld();
            Start = new aboutgame();
            Greenfoot.setWorld(Start);
        }
    }    
}
