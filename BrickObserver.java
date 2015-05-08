import greenfoot.*;

/**
 * Write a description of class BrickObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class BrickObserver extends Actor implements ICollisionObserver {

    private IBrick iBrick;
    GameManager gm;
    
    public BrickObserver(GameManager pgm){
        gm=pgm;
    }

   /* public void update(IBrick brick) {
        System.out.println("Notifying Brick "+brick);
        System.out.println("Notifying getWorld() "+getWorld());
        brick.operation();
        gm.getGMWorld().removeObject((Actor)brick);
    }*/
    
    public void update(IBrick brick) {
       // System.out.println("Notifying Brick "+brick);
       // System.out.println("Notifying getWorld() "+getWorld());
        brick.doAction();
//        gm.getGMWorld().removeObject((Actor)brick);//
    }


    

}
