import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bb extends World
{
    //GreenfootSound BGM = new GreenfootSound("bs.wav");
    /**
     * Constructor for objects of class bb.
     * 
     */
    public bb()
    {    
        super(950, 439, 1);
        prepare();
    }

    public void act()
    {
        //music();
    }

    public void music()
    {        
        //if(!BGM.isPlaying()){
        //BGM.playLoop();
        //BGM.setVolume(70);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        playagain playagain = new playagain();
        addObject(playagain,480,374);
    }
}
