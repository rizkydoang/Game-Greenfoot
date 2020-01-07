import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg2 extends lvl
{
    GreenfootSound BGM = new GreenfootSound("bs.wav");
    public static boolean stopGame = false;
    public bg2()
    {    
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new awan(),1000,Greenfoot.getRandomNumber(10));
        }
        score();
        nyawa();
        stopgame();
    }
    public void tambahplayer1()
    {
        player player = new player();
    }
    private void prepare()
    {
        wall1 wall1 = new wall1();
        addObject(wall1,232,608);
        wall3 wall3 = new wall3();
        addObject(wall3,748,612);
        wall4 wall4 = new wall4();
        addObject(wall4,998,483);
        wall3 wall32 = new wall3();
        addObject(wall32,646,358);
        wall1 wall12 = new wall1();
        addObject(wall12,228,220);
        musuh musuh = new musuh();
        addObject(musuh,950,221);
        musuh1 musuh1 = new musuh1();
        addObject(musuh1,520,490);
        musuh3 musuh3 = new musuh3();
        addObject(musuh3,880,426);
        box box = new box();
        addObject(box,190,547);
        player player = new player();
        addObject(player,29,542);
        musuhsusah musuhsusah = new musuhsusah();
        addObject(musuhsusah,120,70);
        portal2 portal2 = new portal2();
        addObject(portal2,48,144);
    }
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
        public void selese()
    {
        addObject(new gameover(), getWidth() / 2, getHeight() / 2);
        stopmusic();
        Greenfoot.playSound("lose.wav");
        Greenfoot.stop();
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
    public void stopmusic(){
        BGM.stop();
    }
}

