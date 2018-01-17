package CommandPattern;

import org.junit.Test;

/**
 * @author liutao
 * @date 2018/1/17  17:17
 */
public class test11 {
    @Test
    public void go() {
        Receiver receiver = new Receiver();
        Command command = new RealCommand(receiver);
        Invoke invoke = new Invoke(command);
        invoke.action();
    }
}
