package SinglePattern;

/**
 * @author liutao
 * @date 2017/12/9  10:40
 */

/**
 * 这种方式基于classloder机制避免了多线程的同步问题
 * 不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种
 * 在单例模式中大多数都是调用getInstance方法， 但是也不能确定有其 他的方式（或者其他的静态方法）导致类装载
 * 这时候初始化instance显然没有达到lazy loading的效果。
 */
public class singlePattern3 {

    private static singlePattern3 instance = new singlePattern3();//在类的装载就直接实例化

    public static singlePattern3 getInstance() {
        return instance;
    }
}
