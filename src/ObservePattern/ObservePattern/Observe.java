package ObservePattern.ObservePattern;

/**
 * @author liutao
 * @date 2017/12/9  13:40
 */

/**
 * 观察者接口
 * 所有观察者必须实现该接口，才能订阅主题的消息
 */
public interface Observe {
    public abstract void update(float temp);
}
