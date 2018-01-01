package ProxyPattern.dymProxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author liutao
 * @date 2017/12/27  16:16
 */
public class test {
    @Test
    public void run() {
        userService user = new userServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(user);
        userService userServiceProxy = (userService) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces()
                , invocationHandler);
        System.out.println(userServiceProxy.getName(1));
        System.out.println(userServiceProxy.getAge(1));
    }

    @Test
    public void run1() {
        userService user = new userServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(user);
        userService userServiceProxy = (userService) Proxy.newProxyInstance(userService.class.getClassLoader(), new Class[]{userService.class}, invocationHandler);
        System.out.println(userServiceProxy.getName(1));
        System.out.println(userServiceProxy.getAge(1));
    }
}
