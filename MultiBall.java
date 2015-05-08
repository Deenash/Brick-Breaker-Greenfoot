import greenfoot.*;

/**
 * Write a description of class MultiBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiBall extends Actor implements IBrickOperation
{
    /**
     * Act - do whatever the MultiBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public ScreenDesign world=null;
     
    public MultiBall(ScreenDesign pWorld)
    {
        world = pWorld;
       // System.out.println("PaddleShort "+world);
    }
    
    public void doOperation(IBrick brick) 
    {
         for (int i=0; i <4 ; i++)
            {
                
                int ballDirection = Greenfoot.getRandomNumber(360); 
               // ((ScreenDesign)(world.getGm().getGMWorld())).addObject(new Ball(((ScreenDesign)(world.getGm().getGMWorld())),ballDirection), ((Actor)brick).getX(), ((Actor)brick).getY());
               world.addObject(new Ball(world,ballDirection), ((Actor)brick).getX(), ((Actor)brick).getY());
            }
    }    
}
