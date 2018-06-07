import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author liutao
 * @date 2018/6/6  23:02
 */
public class ThreadFactoryTest {
    public static void main(String[] args) {
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }).start();
    }
}
