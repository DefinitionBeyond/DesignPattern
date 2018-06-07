package SingleThreadExecutionPattern.Test1_0;

/**
 * @author liutao
 * @date 2018/6/7  8:39
 */
public class CliTest {
    public static void main(String[] args) {
        Gate gate = new Gate();
//        JCTGate gate = new JCTGate();
        new Thread(new UserClass("Black", "Blund", gate)).start();
        new Thread(new UserClass("Alice", "Alask", gate)).start();
        new Thread(new UserClass("Chris", "Canada", gate)).start();
        new Thread(new UserClass("Paul", "USA", gate)).start();
    }
}