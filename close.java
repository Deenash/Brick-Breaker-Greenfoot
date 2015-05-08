import greenfoot.*;

/**
 * Write a description of class close here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class close extends Actor
{
    /**
     * Act - do whatever the close wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 //GameManager gameMng;
  public void act() 
    {
     if (Greenfoot.mouseClicked(this)) 
     {//true if you clicked at this object;  
            Home w = new Home();  
            Greenfoot.setWorld(w);  
   }
}
}
