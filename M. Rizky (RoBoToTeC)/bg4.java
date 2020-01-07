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

        wall5 wall5 = new wall5();
        addObject(wall5,34,608);
        wall5 wall52 = new wall5();
        addObject(wall52,161,512);
        player player = new player();
        addObject(player,24,520);
        wall5 wall53 = new wall5();
        addObject(wall53,279,610);
        wall5 wall54 = new wall5();
        addObject(wall54,406,517);
        wall5 wall55 = new wall5();
        addObject(wall55,536,425);
        wall4 wall4 = new wall4();
        addObject(wall4,711,331);
        wall5 wall56 = new wall5();
        addObject(wall56,533,231);
        wall4 wall42 = new wall4();
        addObject(wall42,318,227);
        wall4 wall43 = new wall4();
        addObject(wall43,47,224);
        portal4 portal4 = new portal4();
        addObject(portal4,47,149);
        wall5 wall57 = new wall5();
        addObject(wall57,535,612);
        wall5 wall58 = new wall5();
        addObject(wall58,868,609);
        wall5 wall59 = new wall5();
        addObject(wall59,748,609);
        wall5 wall510 = new wall5();
        addObject(wall510,636,611);
        musuh3 musuh3 = new musuh3();
        addObject(musuh3,880,426);
        musuhsusah4 musuhsusah4 = new musuhsusah4();
        addObject(musuhsusah4,32,299);
        musuh musuh = new musuh();
        addObject(musuh,932,215);
        musuhsusah5 musuhsusah5 = new musuhsusah5();
        addObject(musuhsusah5,964,64);
        musuhsusah3 musuhsusah3 = new musuhsusah3();
        addObject(musuhsusah3,502,317);
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
    public void selese()
    {
        addObject(new gameover(), getWidth() / 2, getHeight() / 2);
        stopmusic();
        Greenfoot.playSound("lose.wav");
        Greenfoot.stop();
    }
    public void music()
    {        
        if(!BGM.isPlaying())
       {
          BGM.playLoop();
          BGM.setVolume(70);
       }
    } 
    public void stopgame(){
        if(nyawa == 0)
        selese();
    }
}

