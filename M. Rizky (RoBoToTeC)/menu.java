import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends lvl
{

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
    private void prepare()
    {
        play play = new play();
        addObject(play,420,445);
        about about = new about();
        addObject(about,682,447);
        play.setLocation(408,445);
        about.setLocation(648,444);
    }
}
