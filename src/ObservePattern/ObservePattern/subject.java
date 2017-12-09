package ObservePattern.ObservePattern;

/**
 * @author liutao
 * @date 2017/12/9  13:39
 */

/**
 * 主题接口
 * 对象接口是观察者
 */
public interface subject {
    public abstract void register(Observe o); // 主题添加观察者方法

    public abstract void remove(Observe o);  //主题删除观察者方法

    public abstract void notifyObserve(); //主题通知观察者方法
}
