import greenfoot.*;

/**
 * Write a description of class GoldenBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenBrick extends BrickCreator
{
    /**
     * Act - do whatever the GoldenBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public IBrickOperation getBrickOperation()
    {
       //System.out.println("sBrick "+ getWorld());
        return new NoOperation();
    };      
}
