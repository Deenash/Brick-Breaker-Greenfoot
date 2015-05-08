import greenfoot.*;

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    
    /**
     * Act - do whatever the level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GameManager gameManager;
    public Start(GameManager gm){
    
        gameManager=gm;
        //score=0;
       // super.setGm(gm);
    }
    public void act() 
    {
        if ( Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("background.mp3");
            gameManager.gameLevel1();
         }
    }    
}
