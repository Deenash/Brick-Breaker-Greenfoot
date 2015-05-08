import greenfoot.*;

/**
 * Write a description of class GameManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameManager 
{
    GameState gameLevel1State;
    GameState gameLevel2State;
    GameState gameOverState;
    GameState currentState;
    World CurrentWorld;
    Ball b;
    
    public GameManager(World w)
    {
        CurrentWorld=w;
        gameLevel1State = new GameLevel1(this);
        gameLevel2State = new GameLevel2(this);
        gameOverState = new GameOver(this);
        currentState= gameLevel1State;
        //CurrentWorld=w;
       // System.out.println("in manager printing:: "+w);
    }

    public void setGMWorld(World inputworld)
    {
        CurrentWorld=inputworld;
    }
    public World getGMWorld()
    {
        return CurrentWorld;
    }
    
     public void gameLevel1()
    {
        currentState.doGameLevel1();
    }
    
    public void gameLevel2()
    {
        currentState.doGameLevel2();
    }
    public void gameOver()
    {
        currentState.doGameOver();
    }
    
    
    public void setLevel1()
    {
        currentState=gameLevel1State;
    }
    public void setLevel2()
    {
        currentState=gameLevel2State;
        //code to call kavya's leve2 creation
        //Greenfoot.setWorld(new Level2(this));
    }
    public void setGameOver()
    {
        currentState=gameOverState;
    }
    
    
    /*void setState(GState nextState){
        switch(nextState){
            case level1 : currentState = gameLevel1State;
            break;
            case level2 : currentState = gameLevel2State;
            break;
            case gOver : currentState = gameOverState;
            break;
        }
    }*/
    public void showState(){
        
       // System.out.println ("Current State : "+currentState.getClass().getName());
        
    }
    
}
