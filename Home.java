import greenfoot.*;

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{ 

    /**
     * Constructor for objects of class Home.
     * 
     */
    
    GameManager gameMng;
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1);  
        
       gameMng = new GameManager(this);
        //g.setLevel1();

        Button but = new Button();
        addObject(but, getWidth()- 520, getHeight() - 133);

        Start start = new Start(gameMng);
        addObject(start, getWidth()-520, getHeight() - 195);
    }
    

    
    public void levelchange(int level)
    {
        if(level==2)
        {
            gameMng.gameLevel2();
        }
    }
}

