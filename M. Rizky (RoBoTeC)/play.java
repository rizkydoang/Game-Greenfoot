import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends tombol
{
   
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            ((menu)getWorld()).stopped();
            World Start = getWorld();
            Start = new bg();
            Greenfoot.setWorld(Start);
        }
    }    
}
