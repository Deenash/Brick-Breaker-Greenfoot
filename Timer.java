import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

public class Timer extends Actor
{
   private static final int STARTING_TIME = 50;
    
   private int seconds = STARTING_TIME;
    
   private long lastCurrentSecond;
   private long timeSaved = 0;
    
   private boolean count = false;
   protected World world = getWorld(); 
 
   
   public Timer() {
       getImage().clear();
       getImage().scale(130, 70);
      
   }
    
   public void act() {
       if (count) {
           if (System.currentTimeMillis() - lastCurrentSecond >= 1000) {
               lastCurrentSecond += 1000;
               seconds--;
               drawTime();
               
           }
           if (seconds == 0) {
               //checkGameOver();
              // System.out.println("world "+getWorld() );
                ((ScreenDesign)getWorld()).getGm().gameOver();
           }
       }
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
       getImage().setColor(Color.gray);
       getImage().fill();
       GreenfootImage text = new GreenfootImage("Time left:", 30, Color.black, new Color(0, 0, 0, 0));
       GreenfootImage time = new GreenfootImage(remainingTime, 40, Color.black, new Color(0, 0, 0, 0));
       getImage().drawImage(text, (getImage().getWidth()/2)-(text.getWidth()/2), 5);
       getImage().drawImage(time, (getImage().getWidth()/2)-(time.getWidth()/2), 30);
   }
    
   public void startTimer() {
       lastCurrentSecond = System.currentTimeMillis() - timeSaved;
       count = true;
   }
   public void stopTimer() {
       timeSaved = System.currentTimeMillis() - lastCurrentSecond;
       count = false;
   }
   public void resetTimer() {
       seconds = STARTING_TIME;
   }
   public void checkGameOver()
   {
           //Board board = (Board) getWorld();
           //board.gameOver();
   }
   
}