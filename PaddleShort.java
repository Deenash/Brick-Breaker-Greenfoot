import greenfoot.*;

/**
 * Write a description of class PaddleShort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaddleShort extends Actor implements IBrickOperation
{
    /**
     * Act - do whatever the PaddleShort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ScreenDesign world=null;
    
    public PaddleShort(ScreenDesign pWorld)
    {
        world = pWorld;
       // System.out.println("PaddleShort "+world);
    }
    
    
    public void doOperation(IBrick brick) 
    {
      
       Paddle paddle =(world).getPaddle();
       paddle.setSmallPaddle();
    }    
}
