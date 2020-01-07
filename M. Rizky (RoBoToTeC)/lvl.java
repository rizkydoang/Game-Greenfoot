import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl extends World
{
    GreenfootSound BGM = new GreenfootSound("bs.wav");
    int score = 0;
    int nyawa = 3;
    /**
     * Constructor for objects of class lvl.
     * 
     */
    public lvl()
    {    
        super(1000, 675, 1); 
    }
    public void act()
    {
        stopgame();
    }
    public void selese()
    {
        addObject(new gameover(), getWidth() / 2, getHeight() / 2);
        stopmusic();
        Greenfoot.playSound("lose.wav");
        Greenfoot.stop();
    }
    public void tambah()
    {
        score = score + 20;
    }
    public void tambahnyawa()
    {
        if(score == 60)
        nyawa = nyawa + 1;
    }
        public void tambahplayer1()
    {
        player player = new player();
    }
    public void stopgame(){
        if(nyawa == 0)
        selese();
    }
    public void stopmusic(){
        BGM.stop();
    }
}
