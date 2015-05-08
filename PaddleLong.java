import greenfoot.*;

/**
 * Write a description of class PaddleLong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaddleLong extends Actor implements IBrickOperation
{
    /**
     * Act - do whatever the PaddleLong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public ScreenDesign world=null;
    
    public PaddleLong(ScreenDesign pWorld)
    {
        world = pWorld;
       // System.out.println("PaddleShort "+world);
    }
    
    
    public void doOperation(IBrick brick) 
    {
       
      // Paddle paddle =((ScreenDesign)(world.getGm().getGMWorld())).getPaddle();
       Paddle paddle =(world).getPaddle();
       paddle.setLargePaddle();
    }       
}
