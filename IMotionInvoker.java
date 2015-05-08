/**
 * Write a description of IMotionInvoker here.
 * used for command pattern for paddle movement, please let me know before editing this file.
 * @author (karan) 
 * @version (prototype1)
 */
public interface IMotionInvoker {

	 void setCommand(IMotionCommand cmd);

	 void invoke();

}
