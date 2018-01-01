package AbstructFactroyPattern;

/**
 * @author liutao
 * @date 2018/1/1  16:40
 */
public abstract class BlackHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("Black Black Black !");
    }

    @Override
    public void talk() {
        System.out.println("talk in English !");
    }
}
