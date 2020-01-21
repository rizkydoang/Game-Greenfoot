
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (XxX_DoanG_XxX) 
 * @version (a version number or a date)
 */
public class player extends mover
{
    private static final int jumpStrength = 14;
    private GreenfootImage[] images = new GreenfootImage[24];
    private int currentImage;
    private static final int speed = 3;
    public boolean jumping;
    private int direction = 1; 
    private int shootingCounter = 10;
    private int vSpeed = 0;  
    private static final int acceleration = 1;
    int score = 0;
    int nyawa = 3;
    public void act() 
    {
        checkKeys();        
        checkFall();
        checkWorld();
        shootingCounter --;
        checkRightWalls();
        checkLeftWalls();
        platformAbove();
        if(isTouching(musuhh.class))
        {
            lvl m = (lvl)getWorld();
            m.selese();
            m.stopmusic();
            Greenfoot.stop();
            Greenfoot.playSound("lose.wav");
        }
    }
    public player()
    {
        images [0] = new GreenfootImage("w11.png");
        images [1] = new GreenfootImage("w11.png");
        images [2] = new GreenfootImage("w11.png");
        images [3] = new GreenfootImage("w21.png");
        images [4] = new GreenfootImage("w21.png");
        images [5] = new GreenfootImage("w21.png");
        images [6] = new GreenfootImage("w31.png");
        images [7] = new GreenfootImage("w31.png");
        images [8] = new GreenfootImage("w31.png");
        images [9] = new GreenfootImage("w41.png");
        images [10] = new GreenfootImage("w41.png");
        images [11] = new GreenfootImage("w41.png");
        images [12] = new GreenfootImage("wb11.png");
        images [13] = new GreenfootImage("wb11.png");
        images [14] = new GreenfootImage("wb11.png");
        images [15] = new GreenfootImage("wb21.png");
        images [16] = new GreenfootImage("wb21.png");
        images [17] = new GreenfootImage("wb21.png");
        images [18] = new GreenfootImage("wb31.png");
        images [19] = new GreenfootImage("wb31.png");
        images [20] = new GreenfootImage("wb31.png");
        images [21] = new GreenfootImage("wb41.png");
        images [22] = new GreenfootImage("wb41.png");
        images [23] = new GreenfootImage("wb41.png");
    }
    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
         direction = 1;
    }
    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
        direction = -1;
    }
    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }
    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        if (atBottom())
        {
            lvl m = (lvl)getWorld();
            m.selese();
            m.stopmusic();
            Greenfoot.playSound("lose.wav");
            Greenfoot.stop();
        }
        jumping = true;
    }
    public boolean shooting()
    {
        if(shootingCounter <= 0 && direction ==1)
        {
            getWorld().addObject(new pelor1(), getX()+15, getY());
            setImage("sht.png");
            shootingCounter = 30;
            return true;
        }
        
        if(shootingCounter <= 0 && direction ==-1)
        {
            getWorld().addObject(new pelor2(), getX()+15, getY());
            setImage("shtb.png");
            shootingCounter = 30;
            return true;
        }
        return false;
    }
    private void checkKeys()
    {
         if (Greenfoot.isKeyDown("a"))
        {
            mundur();
            moveLeft();
        }
         if (Greenfoot.isKeyDown("d") )
        {
            maju();
            moveRight();
        }
         if (Greenfoot.isKeyDown("w") )
        {
            if (onGround())
            jump(); 
        }
        if (Greenfoot.isKeyDown("s") )
        {
            setImage("dead.png");
        }
          if(Greenfoot.isKeyDown("space")) 
        {
            shooting();
        }
    }    
    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, wall.class);
        if(rightWall == null)
        {
            return false;
        }
        else
        {
            stopByRightWall(rightWall);
            return true;
        }
    }
    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 1, getY());
    }
    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, wall.class);
        if(leftWall == null)
        {
            return false;
        }
        else
        {
            stopByLeftWall(leftWall);
            return true;
        }
    }
    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 2, getY());
    }
    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, wall.class);
        if(ceiling != null)
        {
            vSpeed = 1;
            bopHead(ceiling);
            return true;
        }
        else
        {
            return false;
        }
    }
    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
    public void jump()
    { 
        Greenfoot.playSound("jump.wav");
        jumping = true;
        setVSpeed(-jumpStrength);
        fall(); 
    }
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }
    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 10;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, wall.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }
    private void checkFall()
    {
        if (onGround()) {
            setVSpeed(0);
        }
        else {
            fall();
        }
    }
    private void maju()
    {
        if(currentImage >= 11)
        {
            currentImage = 0;
        } else 
        {
            currentImage++;
        }
        setImage(images[currentImage]);
    }
    private void mundur()
    {
        if(currentImage >= 23)
        {
            currentImage = 12;
        } else 
        {
            currentImage++;
        }
        setImage(images[currentImage]);
    }
    public void checkWorld(){
        if (isTouching(portal.class))
        {
            Greenfoot.setWorld(new bg2());
        }
        if (isTouching(portal2.class))
        {
            Greenfoot.setWorld(new bg3());
        }
        if (isTouching(portal3.class))
        {
            Greenfoot.setWorld(new bg4());
        }
        if (isTouching(portal4.class))
        {
            Greenfoot.setWorld(new bg5());
        }
        if (isTouching(portal5.class))
        {
            lvl m = (lvl)getWorld();
            m.stopmusic();
            Greenfoot.setWorld(new bb());
            Greenfoot.playSound("win.wav");
        }
    }
    
}
