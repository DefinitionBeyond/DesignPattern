package SinglePattern;

/**
 * @author liutao
 * @date 2017/12/9  11:19
 */

/**
 * 使用双重锁检测机制，确保并发情况下instance 对象不会被重复的初始化
 * <p>
 * 使用volatile 修饰符，防止指令重排引发初始化问题
 * <p>
 * 保证线程的安全
 */
public class singlePattern7 {
    private singlePattern7() {

    }

    private volatile static singlePattern7 instance = null;

    public static singlePattern7 getInstance() {

        if (instance == null) { // 双重检验机制

            synchronized (singlePattern7.class) { //设置同步锁

                if (instance == null) { // 双重检验机制
                    instance = new singlePattern7();
                }
            }
        }
        return instance;
    }
}
