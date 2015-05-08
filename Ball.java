import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * The ball of the game. It moves and bounces off the walls and the paddle.
 * 
 * @author (karan)
 * @version (prototype2)
 */
public class Ball extends Actor implements ICollisionSubject
{   GifImage gifImage = new GifImage("FIREBALL.gif");
    private int deltaX;         // x movement speed
    private int deltaY;         // y movement speed
   // protected ScreenDesign world = ((ScreenDesign) getWorld());
   ScreenDesign sdi;
    
    private ArrayList<ICollisionObserver> observer = new ArrayList<ICollisionObserver>(); 
    protected ScreenDesign world = (ScreenDesign) getWorld();
    
    private boolean stuck = true;   // stuck to paddle
    
    public Ball(World world)
     
    {
        attach(((ScreenDesign)world).getBrickObserver());
        attach(((ScreenDesign)world).getScore());
    }
    
    public Ball(World world,int direction)
    {
       //setRotation(direction);
       
        deltaX = Greenfoot.getRandomNumber(11) - 5;
            deltaY = Greenfoot.getRandomNumber(11) - 5;
        stuck = false;
       
        attach(((ScreenDesign)world).getBrickObserver());
        attach(((ScreenDesign)world).getScore());
    }
    
    /**
     * Act. Move if we're not stuck.
     */
    public void act() 
    {
        
          setImage(gifImage.getCurrentImage());  
        if (!stuck) 
        {
            
            move();
            
           // checkOut();
        }
    }
    
    /**
     * Move the ball. Then check what we've hit.
     */
    public void move()
    {
        setLocation (getX() + deltaX, getY() + deltaY);
        checkPaddle();
        checkWalls();
        checkBrick();
        checkGameOver();
    }
    
    /**
     * Check whether we've hit one of the three walls. Reverse direction if necessary.
     */
    private void checkWalls()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1) {
           
            deltaX = -deltaX;
        }
        if (getY() == 0 || getY() == getWorld().getWidth()-1) {
            
          
            deltaY = -deltaY;
        }
    }
    
    /**
     * Check whether we're out (bottom of screen).
     */
    private void checkOut()
    {
        if (getY() == getWorld().getHeight()-1) {
           // System.out.println("Before World");
            ((ScreenDesign)getWorld()).ballIsOut();
                      // System.out.println("After World");
            getWorld().removeObject(this);
        }
    }
    
    private void checkPaddle()
    {
        Actor paddle = getOneIntersectingObject(Paddle.class);
        if (paddle != null) {
            
            
            deltaY = -deltaY;
            int offset = getX() - paddle.getX();
            deltaX = deltaX + (offset/10);
            
            if (deltaX > 7) {
                deltaX = 7;
            }
            if (deltaX < -7) {
                deltaX = -7;
            }
           
        }            
    }
    
    /**
     * Move the ball a given distance sideways.
     */
    public void move(int dist)
    {
        setLocation (getX() + dist, getY());
    }

    
    
    /**
     * Release the ball from the paddle.
     */
    public void release()
    {
        deltaX = 1;
        deltaY = -7;
        stuck = false;
    }
    
    private void checkBrick(){
        
        
        Actor brick = getOneIntersectingObject(IBrick.class);
        if(brick!=null)
        {
         
            notifyObserver((IBrick)brick);
            deltaX = Greenfoot.getRandomNumber(11) - 5;
            
            deltaY = -deltaY;
           
        }
       
        

    }
    
    public void attach(ICollisionObserver obj) {
        observer.add(obj);
    }


    /**
     * @see ICollisionSubject#detach(ICollisionObserver)
     */
    public void detach(ICollisionObserver obj) {
             observer.remove(obj);
    }


    /**
     * @see ICollisionSubject#notifyObserver()
     */
    public void notifyObserver(IBrick brick) {
        for (ICollisionObserver obj: observer){
            obj.update(brick);
        }
    }
   
public void checkGameOver()
   {
              
               
       if (getY() == getWorld().getHeight()-1) {
         
            if (getWorld().getObjects(Ball.class).size() >= 2)
           {
              
               getWorld().removeObject(this);
            }
            else{
            ((ScreenDesign)getWorld()).getGm().b=this;
           ((ScreenDesign)getWorld()).getGm().gameOver();
        }
       
   }
    
    
}}
