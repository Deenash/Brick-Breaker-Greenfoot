import greenfoot.*;

public class GState extends Actor implements GameState{
	//protected ScreenDesign world = (ScreenDesign) getWorld();
	GameManager g_manager;
	

	public GState(GameManager gm){
		g_manager = gm;
	}
	public void doGameLevel1(){
	    //do level1 stuff hereeeeeeee
	    //csll new world 1 or quaivalent method from kavya
	    //new Level1();
	    //System.out.println(g_manager.getGMWorld() +"    ----home");
	    Level1 level1 = new Level1(g_manager);
	    Greenfoot.setWorld(level1);
	    g_manager.setGMWorld(level1);
	    //level1.initaitaepaddle();
	    //System.out.println("plz tell type ---"+g_manager.getGMWorld().getClass().getName());
	    level1.setScoreC();
	    
	    
	    //System.out.println(g_manager.getGMWorld()+"-----new");
	    //World w=g_manager.getWorld();
	    //System.out.println("print current world plzzz" + w);
		//System.out.println("Game Start is not valid in " +this.getClass().getName()+" state.");
		//Greenfoot.setWorld(new Board());
		//call kavyas method to move to world1
	}
	public void doGameLevel2(){
	    // do leverl 2 stufff hereeeee
	    //System.out.println("Level 2 g_manager" +g_manager);
	    Level2 level2 = new Level2(g_manager);
	    Greenfoot.setWorld(level2);
	    g_manager.setGMWorld(level2);
		//System.out.println("Game Level change is not valid in " +this.getClass().getName()+" state.");
	}
	public void doGameOver(){
	    //World world =  getWorld();
		//System.out.println("Game Over is not valid in " +this.getClass().getName()+" state.");
		//System.out.println("GState World " + g_manager.getGMWorld().getClass().getName());
		
		ScreenDesign world = (ScreenDesign)g_manager.getGMWorld();
		//System.out.println("GState World 2" + world);
		//System.out.println("Get SCore " + world.getScore().getCurrentScore());
		world.removeObject(g_manager.b);
		
		world.addObject(new GameOverBoard((world).getScore().getCurrentScore()), world.getWidth()/2, world.getHeight()/2);
		Greenfoot.stop();
	}
}
    
