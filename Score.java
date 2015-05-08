import greenfoot.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class Score extends Actor implements ICollisionObserver {

    //FinalScore fs;
    public static int score=0;
    int bCnt=0;
     
       private long lastCurrentSecond;
       public void setScore()
       {
score=0;
        }
    public Score(int brickCnt){
    
      getImage().clear();
      getImage().scale(130,70);
       // System.out.println("Score Con "+brickCnt);
      bCnt=brickCnt;
      //createScore();
    }
    
     public void act() 
    {
        if(System.currentTimeMillis() - lastCurrentSecond >= 1000)
        {
            lastCurrentSecond +=1000;
            displayScore();
        }
        
        
    } 
    
    public void update(IBrick brick){
      //  System.out.println("Call update ");
        score++;
        if ( ((ScreenDesign)getWorld()).getClass().getName()=="Level1"){
        bCnt--;
        //System.out.println("Score "+score);
       if(bCnt == 0)
       {
        ((ScreenDesign)getWorld()).getGm().gameLevel2();
        }
    }

         
        displayScore();
       
    }
    
    public void displayScore(){
      
   GreenfootImage image = new GreenfootImage(71, 355);
   image.clear();
   setImage(new GreenfootImage("SCORE: "+score,20,Color.WHITE,null));
  // System.out.println( "Display Score "+((ScreenDesign)getWorld()));
 

}
    
     public void createScore(){
        
        getImage().setColor(Color.gray);
        getImage().scale(100,200);
        getImage().fill();
       
         
    }
    
    public int getCurrentScore()
    {
        return score;
    }

    }
