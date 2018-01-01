package FactoryMethodPattern;

import org.junit.Test;

/**
 * @author liutao
 * @date 2018/1/1  15:57
 */
public class test11 {
    @Test
    public void go() {
        IFactory factory = null;
        factory = new OrangeFactory();
        IFruits orange = factory.getFruit();
        orange.disPaly();
        factory = new AppleFactory();
        IFruits apple = factory.getFruit();
        apple.disPaly();
    }
}
