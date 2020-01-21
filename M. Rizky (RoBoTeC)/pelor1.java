import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pelor1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pelor1 extends peluru
{
    /**
     * Act - do whatever the pelor1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pelor1()
    {
        setImage("pelor1.png");
        Greenfoot.playSound("p1.wav");
    }
    public void act() 
    {
        int x=getX();
        int y=getY();
        setLocation(x+17,y);
        if(x >= getWorld().getWidth()-1){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneObjectAtOffset(0 ,0, musuhh.class);
        if(a != null){
            getWorld().addObject(new fire(),getX(),getY());
            ((lvl)getWorld()).tambah();
            ((lvl)getWorld()).tambahnyawa();
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
