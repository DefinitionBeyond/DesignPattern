package SinglePattern;

/**
 * @author liutao
 * @date 2017/12/9  9:41
 */


/**
 * 线程不安全
 *
 * 这种懒加载就显得非常明显
 * 但是在多线程时候，很多线程不能正常工作
 */
public class singlePattern1 {

    private static singlePattern1 instance; //采用一个静态对象

    public static singlePattern1 getInstance(){

        if(instance == null){ // 如果没有该对象的实例
            instance = new singlePattern1(); // 实例化该对象
        }

        return instance;
    }
}
