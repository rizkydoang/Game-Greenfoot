import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burung extends Actor
{
    /**
     * Act - do whatever the burung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] images = new GreenfootImage[27];
    private int currentImage;
    public void act() 
    {
        int x=getX();
        int y=getY();
        setLocation(x+2,y);
        if(x>=getWorld().getWidth()-1){
            getWorld().removeObject(this);
        }
        animasi();
    }  
    public burung()
    {
        images [0] = new GreenfootImage("b1.png");
        images [1] = new GreenfootImage("b1.png");
        images [2] = new GreenfootImage("b1.png");
        images [3] = new GreenfootImage("b2.png");
        images [4] = new GreenfootImage("b2.png");
        images [5] = new GreenfootImage("b2.png");
        images [6] = new GreenfootImage("b3.png");
        images [7] = new GreenfootImage("b3.png");
        images [8] = new GreenfootImage("b3.png");
        images [9] = new GreenfootImage("b4.png");
        images [10] = new GreenfootImage("b4.png");
        images [11] = new GreenfootImage("b4.png");
        images [12] = new GreenfootImage("b5.png");
        images [13] = new GreenfootImage("b5.png");
        images [14] = new GreenfootImage("b5.png");
        images [15] = new GreenfootImage("b6.png");
        images [16] = new GreenfootImage("b6.png");
        images [17] = new GreenfootImage("b6.png");
        images [18] = new GreenfootImage("b7.png");
        images [19] = new GreenfootImage("b7.png");
        images [20] = new GreenfootImage("b7.png");
        images [21] = new GreenfootImage("b8.png");
        images [22] = new GreenfootImage("b8.png");
        images [23] = new GreenfootImage("b8.png");
        images [24] = new GreenfootImage("b9.png");
        images [25] = new GreenfootImage("b9.png");
        images [26] = new GreenfootImage("b9.png");
    }
    private void animasi()
    {
        if(currentImage == 26)
        {
            currentImage = 0;
        } else 
        {
            currentImage++;
        }
        setImage(images[currentImage]);
    }
}
