package ObservePattern.ObserverPatternByJDKAPI;


import java.util.Observable;
import java.util.Observer;

/**
 * @author liutao
 * @date 2017/12/9  14:27
 */

/**
 * 观察者
 */
public class weatherAppUser implements Observer, displayMessage {
    Observable observable;
    private float currentTemp;//更新的当前信息数据
    private float lastTemp; // 上一次的信息数据

    public weatherAppUser(Observable observable) { //实例的时候自己添加到注册表
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof weatherData) {
            weatherData wData = (weatherData) observable;
            lastTemp = currentTemp;
            currentTemp = wData.getTemp();
            display();
        }
    }

    @Override
    public void display() {
        if (currentTemp > lastTemp) {
            System.out.println("测量值变大了！");
        } else if (currentTemp == lastTemp) {
            System.out.println("测量值没变！");
        } else if (currentTemp < lastTemp) {
            System.out.println("测量值变小了！");
        }
    }
}
