import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class portal3 extends Actor
{
    /**
     * Act - do whatever the portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] images = new GreenfootImage[36];
    private int currentImage;
    public void act() 
    {
       animasi();
    }  
    public portal3()
    {
        images [0] = new GreenfootImage("portal1.png");
        images [1] = new GreenfootImage("portal1.png");
        images [2] = new GreenfootImage("portal1.png");
        images [3] = new GreenfootImage("portal1.png");
        images [4] = new GreenfootImage("portal2.png");
        images [5] = new GreenfootImage("portal2.png");
        images [6] = new GreenfootImage("portal2.png");
        images [7] = new GreenfootImage("portal2.png");
        images [8] = new GreenfootImage("portal3.png");
        images [9] = new GreenfootImage("portal3.png");
        images [10] = new GreenfootImage("portal3.png");
        images [11] = new GreenfootImage("portal3.png");
        images [12] = new GreenfootImage("portal4.png");
        images [13] = new GreenfootImage("portal4.png");
        images [14] = new GreenfootImage("portal4.png");
        images [15] = new GreenfootImage("portal4.png");
        images [16] = new GreenfootImage("portal5.png");
        images [17] = new GreenfootImage("portal5.png");
        images [18] = new GreenfootImage("portal5.png");
        images [19] = new GreenfootImage("portal5.png");
        images [20] = new GreenfootImage("portal6.png");
        images [21] = new GreenfootImage("portal6.png");
        images [22] = new GreenfootImage("portal6.png");
        images [23] = new GreenfootImage("portal6.png");
        images [24] = new GreenfootImage("portal7.png");
        images [25] = new GreenfootImage("portal7.png");
        images [26] = new GreenfootImage("portal7.png");
        images [27] = new GreenfootImage("portal7.png");
        images [28] = new GreenfootImage("portal8.png");
        images [29] = new GreenfootImage("portal8.png");
        images [30] = new GreenfootImage("portal8.png");
        images [31] = new GreenfootImage("portal8.png");
        images [32] = new GreenfootImage("portal9.png");
        images [33] = new GreenfootImage("portal9.png");
        images [34] = new GreenfootImage("portal9.png");
        images [35] = new GreenfootImage("portal9.png");
    }
    private void animasi()
    {
        if(currentImage == 35)
        {
            currentImage = 0;
        } else 
        {
            currentImage++;
        }
        setImage(images[currentImage]);
    }
}
