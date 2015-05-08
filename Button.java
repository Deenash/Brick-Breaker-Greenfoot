import greenfoot.*;

public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Button()
    {   
        GreenfootImage image= getImage();
        image.scale(image.getWidth() - 40,image.getHeight());
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) //true if you clicked at this object; 
       {
            
           
           getWorld().addObject(new Instruction(),500,250);
           getWorld().addObject(new close(),740,380);
       }    
    
    
    }
}