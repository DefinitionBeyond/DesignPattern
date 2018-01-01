package AbstructFactroyPattern;

/**
 * @author liutao
 * @date 2018/1/1  16:41
 */
public abstract class YellowHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("Yellow Yellow Yellow !");
    }

    ;

    @Override
    public void talk() {
        System.out.println("talk in Chinese , janises ..... !");
    }
}
