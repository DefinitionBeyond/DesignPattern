package ObservePattern.ObservePattern;

import java.util.ArrayList;

/**
 * @author liutao
 * @date 2017/12/9  13:50
 */
public class weatherData implements subject {

    private ArrayList observes; // 观察者的注册表

    private float temp; // 通知的消息

    public weatherData() {
        observes = new ArrayList();
    }

    @Override
    public void register(Observe o) {
        observes.add(o);
    }

    @Override
    public void remove(Observe o) {

        int i = observes.indexOf(o); // 找到该观察者在注册表位置，并在注册表中删除
        if (i >= 0) {
            observes.remove(i);
        }
    }

    @Override
    public void notifyObserve() { //消息发布
        for (int i = 0; i < observes.size(); i++) {
            Observe observe = (Observe) observes.get(i);
            observe.update(temp);
        }
    }

    public void MeasureChange() { // 消息一旦发生改变，在此向观察者发布更新信息
        notifyObserve();
    }

    public void setMeasure(float temp) {
        this.temp = temp;
        MeasureChange();
    }
}
