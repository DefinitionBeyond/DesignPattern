package SimpleFactoryPattern;

/**
 * @author liutao
 * @date 2018/1/1  15:00
 */
public class BWM implements Car {
    @Override
    public void disPlay() {
        System.out.println("I am BWM , shangwu che !");
    }

    @Override
    public String madeIN(String address) {
        System.out.println("I from " + address);
        return null;
    }
}
