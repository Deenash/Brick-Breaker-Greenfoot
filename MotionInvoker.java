/**
 * Write a description of MotionInvoker here.
 * used for command pattern for paddle movement, please let me know before editing this file.
 * @author (karan) 
 * @version (prototype1)
 */
public class MotionInvoker implements IMotionInvoker {


    /**
     * @see IMotionInvoker#setCommand(IMoionCommand)
     */
    
    private IMotionCommand command;
    public void setCommand(IMotionCommand cmd) {
    
    command=cmd;
    }


    /**
     * @see IMotionInvoker#invoke()
     */
    public void invoke() {
      command.execute();
    }

}
