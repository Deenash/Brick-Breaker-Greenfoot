import greenfoot.*;

/**
 * Write a description of class ScreenDesign1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ScreenDesign extends World
{
//    super(1000, 500, 1); 
    Paddle paddle;
    GameManager gm;
    BrickObserver brickObserver;
    Score score;
    public int brickCnt;
    /**
     * Constructor for objects of class ScreenDesign1.
     * 
     */
    public abstract void brickPattern();
    
      public Paddle getPaddle()
{
    return paddle;
}

public int getBrickCnt()
{
    return brickCnt;
}

public BrickObserver getBrickObserver()
{
    return brickObserver;
}

public Score getScore()
{
   
    return score;
}




public GameManager getGm()
{
    return gm;
}

public void setGm(GameManager pgm)
{
    gm=pgm;
}
public void setBrckCount(int count)
{
    brickCnt=count;
    
}
public void ballIsOut()
    {
        paddle.newBall();
    }
    
    
    public ScreenDesign getScreenDesign()
    {
        return null;
    }
public void setScore()
{
    score.setScore();
}

    public ScreenDesign(GameManager gm)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1);  
        brickPattern();
       
        brickObserver = new BrickObserver(gm);
        score = new Score(brickCnt);
         addObject(score,82,434);
       
        
        Timer timer = new Timer();
        addObject ( timer, getWidth()-70, getHeight()-440);
        timer.startTimer();
        //Score
        paddle = new Paddle();
        addObject(paddle,505,484);
        paddle.addedToWorld(this);
        //score = new Score(this);
       
        
        
       

     
    }
}
