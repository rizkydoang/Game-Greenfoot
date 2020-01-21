  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class awan extends Actor
{
    /**
     * Act - do whatever the awan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x=getX();
        int y=getY();
        setLocation(x-1,y);
        if(x==0){
            getWorld().removeObject(this);
        }
    }    
    public awan() 
    {
        GreenfootImage img = new GreenfootImage("awan.png");
        double scaleFactor = (Greenfoot.getRandomNumber(15)+1) / 10.0; //random number between 0.1 and 4.0
        img.scale( (int)(img.getWidth()*scaleFactor), (int)(img.getHeight()*scaleFactor));
        setImage(img);
    }
}


