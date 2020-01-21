import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends lvl
{
    GreenfootSound BGM = new GreenfootSound("bs.wav");
    /**
     * Constructor for objects of class level.
     * 
     */
    public menu()
    {    
        prepare();
    }

    public void started(){
        music();
    }

    public void music()
    {        
        if(!BGM.isPlaying()){
            BGM.playLoop();
            BGM.setVolume(70);
        }
    }

    public void stopmusic(){
        BGM.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        play play = new play();
        addObject(play,381,288);
        about about = new about();
        addObject(about,560,288);
        helpp helpp = new helpp();
        addObject(helpp,884,404);
    }
}
