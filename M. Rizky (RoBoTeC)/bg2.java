import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg2 extends lvl
{
    public static boolean stopGame = false;
    player player = new player();
    public bg2()
    {    

        prepare();
    }

    public void act()
    {
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new awan(),1000,Greenfoot.getRandomNumber(10));
        }
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new burung(),0,Greenfoot.getRandomNumber(210));
        }
        score();
        nyawa();
        stopgame();
    }

    public void score()
    {
        showText("score = "+ score , 50, 30);
    }

    public void nyawa()
    {
        showText("Nyawa = "+ nyawa , 900, 30);
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

    public void selese()
    {
        addObject(new gameover(), getWidth() / 2, getHeight() / 2);
        Greenfoot.playSound("lose.wav");
        Greenfoot.stop();
    }

    public void stopgame(){
        if(nyawa == 0)
            selese();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        wall1 wall1 = new wall1();
        addObject(wall1,178,414);
        wall3 wall3 = new wall3();
        addObject(wall3,541,416);
        wall2 wall2 = new wall2();
        addObject(wall2,902,316);
        wall5 wall5 = new wall5();
        addObject(wall5,752,417);
        wall1 wall12 = new wall1();
        addObject(wall12,593,212);
        wall2 wall22 = new wall2();
        addObject(wall22,282,122);
        wall4 wall4 = new wall4();
        addObject(wall4,65,120);
        portal2 portal2 = new portal2();
        addObject(portal2,37,63);
        musuh1 musuh1 = new musuh1();
        addObject(musuh1,382,332);
        box box = new box();
        addObject(box,127,368);
        down down = new down();
        addObject(down,380,254);
        up up = new up();
        addObject(up,383,413);
        musuh1 musuh12 = new musuh1();
        addObject(musuh12,916,176);
        down down2 = new down();
        addObject(down2,912,72);
        up up2 = new up();
        addObject(up2,920,286);
        musuhsusah2 musuhsusah2 = new musuhsusah2();
        addObject(musuhsusah2,150,55);
        down down3 = new down();
        addObject(down3,151,0);
        up up3 = new up();
        addObject(up3,150,198);
        player player = new player();
        addObject(player,22,343);
    }
}

