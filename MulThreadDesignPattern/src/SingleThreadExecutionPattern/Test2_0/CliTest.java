package SingleThreadExecutionPattern.Test2_0;

/**
 * @author liutao
 * @date 2018/6/7  10:10
 */
public class CliTest {
    public static void main(String[] args) {
        BoundResource resource = new BoundResource(10);
        for (int i = 0; i < 10; i++) {
            new Thread(new UseResource(resource)).start();
        }
    }
}
