import greenfoot.*;

/**
 * Write a description of class BrickCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class BrickCreator  extends greenfoot.Actor implements IBrick 
{
    /**
     * Act - do whatever the BrickCreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ScreenDesign world;
    
    public BrickCreator(){
    
    world=(ScreenDesign)getWorld();
    // System.out.println("BrickCreator "+ getWorld());
    }
    public abstract IBrickOperation getBrickOperation();
    
    public void doAction() 
    {
         
       // Greenfoot.playSound("collision.mp3");
      IBrickOperation addOperation = getBrickOperation();
      addOperation.doOperation(this);
       getWorld().removeObject(this);
    }    
}
