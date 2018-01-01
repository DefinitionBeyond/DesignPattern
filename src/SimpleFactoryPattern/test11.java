package SimpleFactoryPattern;

import org.junit.Test;

/**
 * @author liutao
 * @date 2018/1/1  15:17
 */
public class test11 {
    @Test
    public void go() {
        SimpleCarFactory factory = new SimpleCarFactory();
        Car masa = factory.createCar("masa");
        masa.disPlay();
        Car falaliy = factory.createCar("falaliy");
        falaliy.disPlay();
        Car bwm = factory.createCar("bwm");
        bwm.disPlay();
    }
}
