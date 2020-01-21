import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuhh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuhh extends Actor
{
     /**
     * Act - do whatever the musuhh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dir=0;
    
    public void act() 
    {
        move();
    }   
    public void move()
    {
        if (dir==0)
        {
             setLocation(getX(),getY()+4);
        }
        else
        {
             setLocation(getX(),getY()-4); 
        }
        
        if (getOneObjectAtOffset(0,0,down.class)!=null)
        { dir=0; }
        if (getOneObjectAtOffset(0,0,up.class)!=null)
        { dir=1; }
    }
}
