import java.util.Collection;

public interface ICollisionSubject {

	public Collection<ICollisionObserver> iCollisionObserver=null;

	public abstract void attach(ICollisionObserver obj);

	public abstract void detach(ICollisionObserver obj);

	public abstract void notifyObserver(IBrick brick);

}
