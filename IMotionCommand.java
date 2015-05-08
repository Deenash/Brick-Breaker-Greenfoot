/**
 * Write a description of IMotionCommand here.
 * used for command pattern for paddle movement, please let me know before editing this file.
 * @author (karan) 
 * @version (prototype1)
 */
public interface IMotionCommand {

    void setReceiver(IReceiver target);
    void execute();
}
