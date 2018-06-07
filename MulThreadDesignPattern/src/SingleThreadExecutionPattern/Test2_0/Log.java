package SingleThreadExecutionPattern.Test2_0;

/**
 * @author liutao
 * @date 2018/6/7  9:46
 */
public class Log {
    public static void println(Object obj) {
        System.out.println(Thread.currentThread().getName() + ":" + obj);
    }
}
