import greenfoot.*;

public class Paddle  extends Actor{
    
    private Ball myBall;
    protected ScreenDesign world = (ScreenDesign) getWorld();
    private boolean b=true;
    private MotionInvoker i;
    MotionInvoker imoveLeft;
    MotionInvoker imoveRight;
    MotionInvoker ireleaseBall;
    ScreenDesign sdi;
    //@@@ Code for paddle image 
    boolean changeImage = false;
    private static final int STARTING_TIME = 10;
    private int seconds = STARTING_TIME;
    private long lastCurrentSecond;
    private long timeSaved = 0;
    //@@ End
    
    public Paddle(){
       
    }
      public void act() 
    {
       
        if(b)
        {
           runCommand();
           b=false;
        }
        
        if (Greenfoot.isKeyDown ("left")) {
            imoveLeft.invoke();
           
        }
        
        if (Greenfoot.isKeyDown ("right")) {
            imoveRight.invoke();
            
        }
        
        if (haveBall() && Greenfoot.isKeyDown ("space")) {
            ireleaseBall.invoke();
          
        }
        
        if(changeImage){
        if (System.currentTimeMillis() - lastCurrentSecond >= 1000) {
               lastCurrentSecond += 1000;
               seconds--;
               drawTime();
               //check brick count
               //if that count is ==0
               //call ((ScreenDesign)getWorld()).getGm().gameLevel2();
           }
           if (seconds == 0) {
               //checkGameOver();
               stopTimer();
               setImage("paddle1_1.png");
           }
       }
        
    }
    
     private void moveSideways(int dist)
    {
        this.setLocation (getX() + dist, getY());
        if (myBall != null) {
            myBall.move (dist);
        }
    }
    
    public void addedToWorld(ScreenDesign world1)
    {
        world=world1;
        newBall();
    }

    public Ball getBall()
    {   //System.out.println("getting ball object");
        return myBall;
    }

    public Paddle getPaddle()
    {  //System.out.println("getting paddle object");
        return this;
    }
    
     public void setBall(Ball b)
    { //  System.out.println("setting the ball object");
         myBall = b;
    }
    
    public void newBall()
    {    //System.out.println("give me (ScreenDesign)getWorld()) "+world);
     
        myBall = new Ball(world);
     
        world.addObject (myBall, getX(), getY()-20);
    }
    
    public boolean haveBall()
    {
        return myBall != null;
    }
    
    public void releaseBall()
    {
        myBall.release();
        myBall = null;
    }
    
     // function to prepare invokers, command and receiver objects, this is run only one time.
    public void runCommand()
    {
       // System.out.println("in command");
         imoveLeft= new MotionInvoker();
         imoveRight= new MotionInvoker();
         ireleaseBall= new MotionInvoker();
        
        MotionCommand cmoveLeft = new MotionCommand();
        MotionCommand cmoveRight = new MotionCommand();
        MotionCommand creleaseBall = new MotionCommand();
        
        cmoveLeft.setReceiver(new IReceiver() { //inner receiver class for moveLeft
                                               public void doAction(){
                                                           Paddle obj;
                                                           obj=getPaddle();
                                                           obj.setLocation (obj.getX() + (-9), obj.getY());
                                                           if (getBall() != null) {
                                                               getBall().move (-9);
                                                            }
                                                          // System.out.println("running left");
                                                           }
                                                        }
                                                        );
        
        cmoveRight.setReceiver(new IReceiver() {
        public void doAction(){    // inner receiver class for moveRight
                                                           Paddle obj;
                                                           obj=getPaddle();
                                                           obj.setLocation (obj.getX() + (9), obj.getY());
                                                           if (getBall() != null) {
                                                               getBall().move (9);
                                                            }
                                                          // System.out.println("running right");
        }
    });
        
        creleaseBall.setReceiver(new IReceiver() { // inner receiver class for releaseBall
        public void doAction(){
                                                           
                                                           if (getBall() != null) {
                                                               getBall().release();
                                                               setBall(null);
                                                            }
                                                           //System.out.println("running space");
        }
    });
        
        imoveLeft.setCommand(cmoveLeft);
        imoveRight.setCommand(cmoveRight);
        ireleaseBall.setCommand(creleaseBall);
        
        
        
        
        
        
        
        
        
    }
   
    //Paddle length
    public void setLargePaddle()
    {
        setImage("paddle.png");
        startTimer();
    }
    
    public void setSmallPaddle()
    {
        setImage("test2.jpg");
        startTimer();
    }
    
     public void startTimer() {
        // System.out.println("Paddle imgage changed");
         timeSaved=0;
         lastCurrentSecond=0;
       lastCurrentSecond = System.currentTimeMillis() - timeSaved;
       changeImage = true;
   }
   
   public void stopTimer() {
      // System.out.println("Paddle imgage retained");
       timeSaved = 0;
       lastCurrentSecond=0;
       changeImage = false;
   }
   
   private void drawTime() {
       int min = (int) (seconds / 60);
       int sec = seconds % 60;
       String remainingTime;
       if (sec < 10) {
           remainingTime = min+":0"+sec;
       }
       else {
           remainingTime = min+":"+sec;
       }
      
   }

}
