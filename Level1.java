import greenfoot.*;

public class Level1 extends ScreenDesign {
     public static int count = 0;
    Level1(GameManager gm)
    { super(gm);
        
        super.setGm(gm);
        Displaylevel1 display = new Displaylevel1();
        addObject(display,502,40);
        
        Displaygif disgif = new Displaygif();
        addObject(disgif,69,81);
        Displaygif disgif1 = new Displaygif();
        addObject(disgif1,933,441);
    }

    public void brickPattern() {
        int xPos = 250;
        int yPos = 86;
        
				    
		   
        
        int numofbricks=18;
        int f7=(numofbricks/2)+1;
        int g7=(numofbricks/2);
        int golden_f7 = f7-1;
        int golden_g7 = g7+1;
                
        for(int i=1;i<=(numofbricks/2);i++)
        {   
               xPos = 250;
               
            for(int j=1;j<=numofbricks;j++)
               {   
                
                if((j>=f7&&j<=g7)&&(j!=1))
                { 
                 if(i==2 || j == golden_f7-2 || j == golden_g7+2 
                    || j== golden_g7+1 || j== golden_f7-1)
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
                    MultiBallBrick brick1 = new  MultiBallBrick();
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
                else
                {
                 xPos=xPos+30;
                  
                }
                
            }
            f7=f7-1;
            g7=g7+1;
            yPos=yPos+14;
        }
        int num9= 18;
        int f9=2;
        int g9=num9-1;
        int golden_f9 = f9 + (num9/2);
        int golden_g9 = g9 - (num9/2);
        for(int i=1;i<=(num9/2);i++)
        {
            xPos = 250;
            for(int j=1;j<=num9;j++)
            {
                if(j>=f9&&j<=g9)
                {
                   if(i==(num9/2)-1 || j == golden_g9 || j == golden_f9 
                   || j== golden_f9+1 || j== golden_g9-1 )
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
                else
                {
                    
                  xPos=xPos+30;
                }
            }
            f9=f9+1;
            g9=g9-1;
            
            yPos=yPos+14;
        }
        
        
        super.setBrckCount(count);
        
    }
    public void setScoreC()
    {
        super.setScore();
        
    }
    

}
