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
        prepare1();
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
    private void prepare1()
    {
        player player = new player();
        addObject(player,432,194);
        player.setLocation(369,122);
        box box = new box();
        addObject(box,233,111);
        box box2 = new box();
        addObject(box2,656,240);
        box2.setLocation(649,267);
        box box3 = new box();
        addObject(box3,355,268);
        box3.setLocation(354, 267);
        musuh musuh = new musuh();
        addObject(musuh,956,203);
        musuh.setLocation(956,203);
        player.setLocation(33,98);
        box box4 = new box();
        addObject(box4,338,483);
        box4.setLocation(339,471);
        removeObject(box4);
        box box5 = new box();
        addObject(box5,338,481);
        box box6 = new box();
        addObject(box6,89,482);       
        wall3 wall3 = new wall3();
        addObject(wall3,504,324);
        wall1 wall1 = new wall1();
        addObject(wall1,287,540);
        wall3 wall32 = new wall3();
        addObject(wall32,820,545);
        wall2 wall2 = new wall2();
        addObject(wall2,126,183);
        box.setLocation(237,130);
        wall1.setLocation(300,605);
        wall3.setLocation(415,383);
        wall32.setLocation(682,574);
        box5.setLocation(92,545);
        box6.setLocation(92,489);
        wall32.setLocation(784,607);
        wall4 wall4 = new wall4();
        addObject(wall4,927,511);
        wall2 wall22 = new wall2();
        addObject(wall22,732,606);
        removeObject(wall32);
        removeObject(box2);
        box3.setLocation(570,324);
        portal portal = new portal();
        addObject(portal,952,438);
        musuh1 musuh1 = new musuh1();
        addObject(musuh1,537,508);
        musuh3 musuh3 = new musuh3();
        addObject(musuh3,857,426);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void started(){
        music();
    }
    public void score()
    {
        showText("score = "+ score , 50, 30);
    }
    public void nyawa()
    {
        showText("nyawa = "+ nyawa , 940, 30);
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
}

