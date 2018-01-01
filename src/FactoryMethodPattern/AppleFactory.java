package FactoryMethodPattern;

/**
 * @author liutao
 * @date 2018/1/1  15:55
 */
public class AppleFactory implements IFactory {
    @Override
    public IFruits getFruit() {
        return new Apple();
    }
}
