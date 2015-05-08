public interface IGameState {

	public GameManager gameManage=null;

	public abstract void doGameStart();

	public abstract void doLevelChange();

	public abstract void doGameOver();

}
