import greenfoot.*;

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends ScreenDesign
{
     public static int count = 0;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2(GameManager gm)
    {
     super(gm);
      super.setGm(gm);
      Displaylevel2 display = new Displaylevel2();
      addObject(display,502,40);
      
      
      
        Displaygif disgif = new Displaygif();
        disgif.setImageI(2);
        addObject(disgif,69,81);
        
        Displaygif disgif1 = new Displaygif();
        disgif1.setImageI(2);
        addObject(disgif1,933,441);
     
    }

    public void brickPattern(){
        int xPos = 305;
        int yPos = 112;
        
        int bricknumber=18;
        int f8=2;
       
        int g8=bricknumber-1;
        int golden_f7 = f8-1;
        int golden_g7 = g8+1;

        for(int i=1;i<=(bricknumber/2);i++)
        {  
            xPos = 305;
            for(int j=1;j<=bricknumber;j++)
            {
                
                if(j>=f8&&j<=g8)
                {
                   xPos=xPos+30;
                }
                
                else
                {
                 if(j==1 || j == g8 || j == f8 || j==bricknumber  )
                  {
                      if(j == Greenfoot.getRandomNumber(18))
                      {
                        PaddleShortBrick brick = new PaddleShortBrick();
                       
                        addObject(brick,xPos,yPos);
                        xPos=xPos+30;
                        count++;
                      }
                      else
                      {
                       GoldenBrick goldenbrick = new  GoldenBrick();
                       addObject(goldenbrick,xPos,yPos);
                       xPos=xPos+30;
                       count++;
                      }
                  } 
          
                  else
                  {
                      
                   if(j == Greenfoot.getRandomNumber(18))
                      {
                        PaddleLongBrick brick = new PaddleLongBrick();
                        addObject(brick,xPos,yPos);
                        xPos=xPos+30;
                        count++;
                      } 
                    else
                    {
                    RedBrick brick1  = new  RedBrick();
                    addObject(brick1,xPos,yPos);
                    xPos=xPos+30;
                    count++;
                    }
                  } 
                
                }
            }
            f8=f8+1;
            g8=g8-1;

            yPos=yPos+14;
        }
   
        xPos = 305;
        //yPos = 112;
        int num6=18;
        int f6=(num6/2)+1;
        int g6=(num6/2);
        for(int i=1;i<=(num6/2);i++)
        {    xPos =305 ;
            for(int j=1;j<=num6;j++)
            {
                if((j>=f6&&j<=g6)&&(j!=1))
                {
                    
                    xPos=xPos+30;
                }
                else
                {
                  if(j== f6 || j== num6 || j==1 || j == g6 )
                  {
                   if(j == Greenfoot.getRandomNumber(18))
                      {
                        MultiBallBrick brick = new MultiBallBrick();
                        addObject(brick,xPos,yPos);
                        xPos=xPos+30;
                        count++;
                      }
                      else
                      {
                       GoldenBrick goldenbrick = new  GoldenBrick();
                       addObject(goldenbrick,xPos,yPos);
                       xPos=xPos+30;
                       count++;
                      }
                  }
                  else
                  {
                  if(j == Greenfoot.getRandomNumber(18))
                  {
                    PaddleLongBrick brick1 = new PaddleLongBrick();
                    addObject(brick1,xPos,yPos);
                    xPos=xPos+30;
                    count++;
                  }
                  else
                  {
                    RedBrick brick1  = new  RedBrick();
                    addObject(brick1,xPos,yPos);
                    xPos=xPos+30;
                    count++;
                  }
                  }
                }

           }

            f6=f6-1;
            g6=g6+1;
           
            yPos=yPos+14;
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    
     
}

