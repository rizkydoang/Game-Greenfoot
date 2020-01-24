import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg5 extends lvl
{

    /**
     * Constructor for objects of class bg5.
     * 
     */
    public bg5()
    {
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new burung(),0,Greenfoot.getRandomNumber(210));
        }
        score();
        nyawa();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        wall5 wall5 = new wall5();
        addObject(wall5,926,117);
        wall5 wall52 = new wall5();
        addObject(wall52,856,234);
        wall5 wall53 = new wall5();
        addObject(wall53,772,163);
        wall5 wall54 = new wall5();
        addObject(wall54,703,335);
        wall5 wall55 = new wall5();
        addObject(wall55,612,269);
        wall4 wall4 = new wall4();
        addObject(wall4,492,196);
        wall5 wall56 = new wall5();
        addObject(wall56,369,126);
        wall4 wall42 = new wall4();
        addObject(wall42,247,416);
        wall5 wall57 = new wall5();
        addObject(wall57,133,336);
        wall4 wall43 = new wall4();
        addObject(wall43,29,248);
        portal5 portal5 = new portal5();
        addObject(portal5,41,191);
        musuhsusah5 musuhsusah5 = new musuhsusah5();
        addObject(musuhsusah5,36,37);
        musuhsusah1 musuhsusah1 = new musuhsusah1();
        addObject(musuhsusah1,122,180);
        down down = new down();
        addObject(down,119,45);
        up up = new up();
        addObject(up,124,300);
        musuh1 musuh1 = new musuh1();
        addObject(musuh1,897,346);
        down down2 = new down();
        addObject(down2,893,272);
        up up2 = new up();
        addObject(up2,900,424);
        musuhsusah3 musuhsusah3 = new musuhsusah3();
        addObject(musuhsusah3,565,352);
        musuh1 musuh12 = new musuh1();
        addObject(musuh12,516,311);
        down down3 = new down();
        addObject(down3,520,233);
        up up3 = new up();
        addObject(up3,519,417);
        player player = new player();
        addObject(player,922,66);
    }
    public void score()
    {
        showText("Score = "+ score , 50, 30);
    }
    public void nyawa()
    {
        showText("Nyawa = "+ nyawa , 900, 30);
    }
    public void selese1()
    {
        addObject(new gameover(), getWidth() / 2, getHeight() / 2);
        addObject(new playagain(), getWidth() / 2, 400);
        removeObjects(getObjects(player.class));
    }
    public void stopgame(){
        if(nyawa == 0)
            selese1();
    }
}
