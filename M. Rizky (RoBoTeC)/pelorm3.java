import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pelor2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pelorm3 extends peluru
{
   /**
     * Act - do whatever the pelor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pelorm3()
    {
        setImage("pelor3.png");
        //Greenfoot.playSound("p1.wav");
    }
    public void act() 
    {
        int x=getX();
        int y=getY();
        setLocation(x,y+13);
        if(y >= getWorld().getHeight()-1){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneObjectAtOffset(0 ,0, mover.class);
        if(a != null){
            lvl m =(lvl)getWorld();
            m.nyawa--;
            getWorld().addObject(new player(),getX(),getY());
            getWorld().addObject(new fire(),getX(),getY());
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }
        Actor b = getOneObjectAtOffset(0 ,0, wall.class);
        if(b != null){
            getWorld().removeObject(this);
            return;
        }
    }    
}
