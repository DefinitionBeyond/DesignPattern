package SinglePattern;

/**
 * @author liutao
 * @date 2017/12/9  10:43
 */

/**
 * 和第3种差不多
 * java的静态代码块，也是在加载的时候就执行
 * 即在装载类的时候就实例化对象
 * 初始化对象就实例化对象
 */
public class singlePattern4 {
    private static singlePattern4 instance = null;

    static {
        instance = new singlePattern4();
    }

    public static singlePattern4 getInstance() {
        return instance;
    }
}
