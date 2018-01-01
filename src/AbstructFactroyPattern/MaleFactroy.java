package AbstructFactroyPattern;

/**
 * @author liutao
 * @date 2018/1/1  16:56
 */
public class MaleFactroy implements IHumanFactroy {

    @Override
    public IHuman createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public IHuman createBlackHuman() {
        return new MaleBlackHuman();
    }
}
