import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg4 extends lvl
{
    public static boolean stopGame = false;
    /**
     * Constructor for objects of class bg4.
     * 
     */
    public bg4()
    {    
        prepare();
    }

    public void act()
    {
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new awan(),1000,Greenfoot.getRandomNumber(70));
        }
        score();
        nyawa();
        stopgame();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    public void score()
    {
        showText("Score = "+ score , 50, 30);
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
        wall5 wall5 = new wall5();
        addObject(wall5,28,420);
        wall5 wall52 = new wall5();
        addObject(wall52,118,363);
        wall5 wall53 = new wall5();
        addObject(wall53,209,420);
        wall5 wall54 = new wall5();
        addObject(wall54,301,365);
        player player = new player();
        addObject(player,20,340);
        wall5 wall55 = new wall5();
        addObject(wall55,397,420);
        wall5 wall56 = new wall5();
        addObject(wall56,396,302);
        wall4 wall4 = new wall4();
        addObject(wall4,526,236);
        wall5 wall57 = new wall5();
        addObject(wall57,660,421);
        wall5 wall58 = new wall5();
        addObject(wall58,743,356);
        wall5 wall59 = new wall5();
        addObject(wall59,826,288);
        wall4 wall42 = new wall4();
        addObject(wall42,945,211);
        wall2 wall2 = new wall2();
        addObject(wall2,748,111);
        portal4 portal4 = new portal4();
        addObject(portal4,697,54);
        musuh1 musuh1 = new musuh1();
        addObject(musuh1,536,340);
        up up = new up();
        addObject(up,536,425);
        down down = new down();
        addObject(down,535,280);
        musuhsusah1 musuhsusah1 = new musuhsusah1();
        addObject(musuhsusah1,64,144);
        up up2 = new up();
        addObject(up2,63,243);
        down down2 = new down();
        addObject(down2,65,36);
        musuhsusah5 musuhsusah5 = new musuhsusah5();
        addObject(musuhsusah5,220,43);
        musuh1 musuh12 = new musuh1();
        addObject(musuh12,743,200);
        down down3 = new down();
        addObject(down3,742,155);
        up up3 = new up();
        addObject(up3,747,324);
    }
}

