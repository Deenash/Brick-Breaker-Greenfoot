/**
 * Write a description of MotionCommand here.
 * used for command pattern for paddle movement, please let me know before editing this file.
 * @author (karan) 
 * @version (prototype1)
 */
public class MotionCommand implements IMotionCommand {


    /**
     * @see IMoionCommand#execute()
     */
    
    private IReceiver receiver;
    public void execute() {
        receiver.doAction();
    }


    /**
     * @see IMoionCommand#setReceiver(IReceiver)
     */
    public void setReceiver(IReceiver target) {
        receiver=target;
    }

}
