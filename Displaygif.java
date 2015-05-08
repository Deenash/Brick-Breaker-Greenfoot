import greenfoot.*;

/**
 * Write a description of class Displaygif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Displaygif extends Actor
{
    /**
     * Act - do whatever the Displaygif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("dmfire.gif");
    //GifImage gifImage = new GifImage("dragon.gif");
    public void  Displaygif()
    {
        
      
    }
    public void act() 
    {
        
          setImage(gifImage.getCurrentImage());   
        // Add your action code here.
    }  
    
    public void setImageI(int i)
    {
        if(i==2)
        {
            gifImage = new GifImage("dmfire.gif");
            
        }
        
    }
}
