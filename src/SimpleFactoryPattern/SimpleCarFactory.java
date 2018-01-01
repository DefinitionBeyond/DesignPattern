package SimpleFactoryPattern;

/**
 * @author liutao
 * @date 2018/1/1  15:07
 */
public class SimpleCarFactory {
    private Car car;

    public Car createCar(String type) {
        switch (type) {
            case "masa":
                return new Masa();
            case "falaliy":
                return new falaliy();
            case "bwm":
                return new BWM();
        }
        return null;
    }
}
