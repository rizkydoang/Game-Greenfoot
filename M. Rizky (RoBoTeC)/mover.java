
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mover extends Actor
{
    
    public boolean jumping;
    private int direction = 1;
    private int vSpeed = 0;

    
    public boolean atBottom()
    {
        return getY() >= getWorld().getHeight()-1;
    } 
    
}
