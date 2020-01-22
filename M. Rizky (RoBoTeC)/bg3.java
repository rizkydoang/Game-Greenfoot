import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg3 extends lvl
{
    public static boolean stopGame = false;
    /**
     * Constructor for objects of class bg3.
     * 
     */
    public bg3()
    {    

        prepare();
    }

    public void act()
    {
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new awan(),1000,Greenfoot.getRandomNumber(70));
        }
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

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        wall2 wall2 = new wall2();
        addObject(wall2,100,95);
        wall2 wall22 = new wall2();
        addObject(wall22,95,419);
        wall5 wall5 = new wall5();
        addObject(wall5,280,420);
        wall4 wall4 = new wall4();
        addObject(wall4,324,105);
        wall1 wall1 = new wall1();
        addObject(wall1,172,250);
        box box = new box();
        addObject(box,300,206);
        wall5 wall52 = new wall5();
        addObject(wall52,383,420);
        wall4 wall43 = new wall4();
        addObject(wall43,522,418);
        musuhsusah3 musuhsusah3 = new musuhsusah3();
        addObject(musuhsusah3,260,351);
        wall1 wall12 = new wall1();
        addObject(wall12,579,253);
        wall4 wall44 = new wall4();
        addObject(wall44,699,418);
        wall5 wall53 = new wall5();
        addObject(wall53,839,419);
        wall2 wall23 = new wall2();
        addObject(wall23,539,95);
        box box2 = new box();
        addObject(box2,736,209);
        musuh1 musuh1 = new musuh1();
        addObject(musuh1,908,124);
        down down = new down();
        addObject(down,905,19);
        up up = new up();
        addObject(up,908,264);
        musuhsusah2 musuhsusah2 = new musuhsusah2();
        addObject(musuhsusah2,374,334);
        down down2 = new down();
        addObject(down2,377,236);
        up up2 = new up();
        addObject(up2,375,400);
        musuhsusah musuhsusah = new musuhsusah();
        addObject(musuhsusah,36,152);
        down down3 = new down();
        addObject(down3,37,114);
        up up3 = new up();
        addObject(up3,36,210);
        portal3 portal3 = new portal3();
        addObject(portal3,37,360);
        player player = new player();
        addObject(player,22,32);
    }
}

