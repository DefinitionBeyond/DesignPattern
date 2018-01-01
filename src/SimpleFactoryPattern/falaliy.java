package SimpleFactoryPattern;

/**
 * @author liutao
 * @date 2018/1/1  15:01
 */
public class falaliy implements Car {
    @Override
    public void disPlay() {
        System.out.println("I am falily , seeped NO.1 !");
    }

    @Override
    public String madeIN(String address) {
        System.out.println("I from " + address);
        return null;
    }
}
