package Proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author liutao
 * @date 2017/12/27  19:44
 */
public class test {
    @Test
    public void go() {
        program p = new program();
        javaProgram java = new javaProgram();

        //cglib加强器，创建动态代理的类
        Enhancer enhancer = new Enhancer();

        //设置要创建动态代理的类
        enhancer.setSuperclass(p.getClass());

        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(java);
        program proxy = (program) enhancer.create();
        proxy.code();
    }
}
