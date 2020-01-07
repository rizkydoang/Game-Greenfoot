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
        //super(1000, 675, 1); 
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
    private void prepare()
    {
        musuh musuh = new musuh();
        addObject(musuh,950,221);
        musuh3 musuh3 = new musuh3();
        addObject(musuh3,880,426);
        wall1 wall1 = new wall1();
        addObject(wall1,237,609);
        wall2 wall2 = new wall2();
        addObject(wall2,138,157);
        wall2.setLocation(138,157);
        removeObject(wall2);
        wall2 wall22 = new wall2();
        addObject(wall22,137,227);
        wall22.setLocation(132,195);
        wall1 wall12 = new wall1();
        addObject(wall12,759,330);
        wall4 wall4 = new wall4();
        addObject(wall4,430,104);
        wall1.setLocation(392,590);
        removeObject(wall1);
        wall2 wall23 = new wall2();
        addObject(wall23,30,604);
        removeObject(wall12);
        wall4 wall42 = new wall4();
        addObject(wall42,700,250);
        player player = new player();
        addObject(player,35,107);
        musuhsusah1 musuhsusah1 = new musuhsusah1();
        addObject(musuhsusah1,28,268);
        musuhsusah3 musuhsusah3 = new musuhsusah3();
        addObject(musuhsusah3,954,541);
        wall5 wall5 = new wall5();
        addObject(wall5,280,604);
        wall4 wall44 = new wall4();
        addObject(wall44,475,603);
        wall4 wall45 = new wall4();
        addObject(wall45,724,605);
        removeObject(wall45);
        wall5 wall52 = new wall5();
        addObject(wall52,694,606);
        wall1 wall13 = new wall1();
        addObject(wall13,180,400);
        wall4 wall46 = new wall4();
        addObject(wall45,491,405);
        box box = new box();
        addObject(box,412,348);
        portal3 portal3 = new portal3();
        addObject(portal3,49,530);
    }
    public void score()
    {
        showText("score = "+ score , 50, 30);
    }
    public void started(){
        music();
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
    public void music()
    {        
        if(!BGM.isPlaying()){
        BGM.playLoop();
        BGM.setVolume(70);
        }
    }
    public void stopgame(){
        if(nyawa == 0)
        selese();
    }
}

