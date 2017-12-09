package SinglePattern;

/**
 * @author liutao
 * @date 2017/12/9  9:58
 */

/**
 * 线程安全的
 * <p>
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading
 * 但是，遗憾的是，效率很低，99%情况下不需要同步。
 */
public class singlePattern2 {
    private static singlePattern1 instance; //采用一个静态对象

    public static synchronized singlePattern1 getInstance() {//持有该对象的锁的线程可以执行该对象方法，，使线程操作有序的操作该方法

        if (instance == null) { // 如果没有该对象的实例
            instance = new singlePattern1(); // 实例化该对象
        }

        return instance;
    }
}
