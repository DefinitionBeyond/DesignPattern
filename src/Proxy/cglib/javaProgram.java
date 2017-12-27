package Proxy.cglib;

;import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liutao
 * @date 2017/12/27  18:37
 */
public class javaProgram implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("I am java . how are you ?");
        methodProxy.invokeSuper(o, objects);

        return null;
    }
}
