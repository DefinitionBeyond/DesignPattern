package ApdaterPattern.ClassAdapter;

import org.junit.Test;

/**
 * @author liutao
 * @date 2018/1/4  11:40
 */
public class test11 {
    @Test
    public void go() {
        Robot a = new Adapter();
        a.cry();
        a.move();
    }
}
