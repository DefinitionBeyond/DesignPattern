package ObservePattern.ObserverPatternByJDKAPI;

import java.util.Observable;

/**
 * @author liutao
 * @date 2017/12/9  14:32
 */

/**
 * 主题
 */
public class weatherData extends Observable {
    private float temp;

    public weatherData() {
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void messageChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMessage(float temp) {
        this.temp = temp;
        messageChanged();
    }
}
