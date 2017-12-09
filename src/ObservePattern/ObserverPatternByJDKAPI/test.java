package ObservePattern.ObserverPatternByJDKAPI;

import org.junit.Test;

/**
 * @author liutao
 * @date 2017/12/9  14:45
 */
public class test {
    @Test
    public void test1() {
        weatherData wD = new weatherData();
        wD.setMessage(9f);
        weatherAppUser s1 = new weatherAppUser(wD);
        weatherAppUser s2 = new weatherAppUser(wD);
        weatherAppUser s3 = new weatherAppUser(wD);
        wD.setMessage(11.2f);
        wD.setMessage(10f);

    }
}
