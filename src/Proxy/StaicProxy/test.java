package Proxy.StaicProxy;

import org.junit.Test;

/**
 * @author liutao
 * @date 2017/12/27  15:35
 */
public class test {
    @Test
    public void run() {
        Subject user = new proxyUser(new realUser());
        user.addUser("123", "456");
        user.findUser("123");
        user.modifyUser("333", "666");
        user.delUser("123");
    }
}
