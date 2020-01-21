import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg extends lvl
{
    public static boolean stopGame = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public bg()
    {    
        prepare();
    }

    public void act()
    {
        if(Greenfoot.getRandomNumber(500)<4){
            addObject(new awan(),getWidth(),Greenfoot.getRandomNumber(40));
        }
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new burung(),0,Greenfoot.getRandomNumber(210));
        }
        score();
        nyawa();
        stopgame();
    }

    private void prepare()
    {
        wall1 wall1 = new wall1();
        addObject(wall1,171,122);
        wall1 wall12 = new wall1();
        addObject(wall12,255,417);

        box box = new box();
        addObject(box,99,369);
        box box2 = new box();
        addObject(box2,99,325);
        wall2 wall2 = new wall2();
        addObject(wall2,479,253);
        wall2 wall22 = new wall2();
        addObject(wall22,588,418);
        wall3 wall3 = new wall3();
        addObject(wall3,855,318);
        player player = new player();
        addObject(player,24,62);
        portal portal = new portal();
        addObject(portal,910,239);
        box box3 = new box();
        addObject(box3,558,209);
        musuh1 musuh1 = new musuh1();
        addObject(musuh1,636,272);
        down down = new down();
        addObject(down,635,224);
        up up = new up();
        addObject(up,637,370);
        musuh1 musuh12 = new musuh1();
        addObject(musuh12,833,152);
        down down2 = new down();
        addObject(down2,832,71);
        wall3.setLocation(835,296);
        up up2 = new up();
        addObject(up2,835,240);
        musuh1 musuh13 = new musuh1();
        addObject(musuh13,512,145);
        down down3 = new down();
        addObject(down3,510,95);
        up up3 = new up();
        addObject(up3,514,225);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void score()
    {
        showText("Score = "+ score , 50, 30);
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

    public void nyawa()
    {
        showText("Nyawa = "+ nyawa , 900, 30);
    }

}