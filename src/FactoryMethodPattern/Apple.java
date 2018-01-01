package FactoryMethodPattern;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @author liutao
 * @date 2018/1/1  15:52
 */
public class Apple implements IFruits {
    @Override
    public void disPaly() {
        System.out.println("Apple !");
    }
}
