package ObservePattern.ObservePattern;

import org.junit.Test;

/**
 * @author liutao
 * @date 2017/12/9  14:04
 */
public class tset {

    @Test
    public void test() {
        weatherData wD = new weatherData();//主题

        //实例化观察者
        weatherAppUser wa1 = new weatherAppUser(wD);
        weatherAppUser wa2 = new weatherAppUser(wD);
        weatherAppUser wa3 = new weatherAppUser(wD);
        wa1.setName("A");
        wa2.setName("B");
        wa3.setName("C");
        wD.setMeasure(19.6f);
        wD.remove(wa2);
        wD.setMeasure(21.6f);
    }
}
