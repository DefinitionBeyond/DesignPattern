package CommandPattern;

/**
 * @author liutao
 * @date 2018/1/17  17:08
 */

/**
 * 实现命令接口
 * 就是一个真正的命令
 */
public class RealCommand implements Command {
    private Receiver receiver;

    public RealCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
