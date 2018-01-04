package ApdaterPattern.ObjectAdapter;

import org.junit.Test;

/**
 * @author liutao
 * @date 2018/1/4  12:06
 */
public class test11 {
    @Test
    public void go() {
        Adaptee adaptee = new Adaptee();
        Target a = new Adapter(adaptee);
        a.cry();
        a.move();
    }
}
