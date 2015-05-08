import greenfoot.*;

/**
 * Write a description of class PaddleLongBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaddleLongBrick extends BrickCreator
{
    /**
     * Act - do whatever the PaddleLongBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public IBrickOperation getBrickOperation()
    {
        //System.out.println("sBrick "+ getWorld());
        return new PaddleLong((ScreenDesign) getWorld());
    };      
}
