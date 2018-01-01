package AbstructFactroyPattern;

/**
 * @author liutao
 * @date 2018/1/1  16:57
 */
public class FemaleFactroy implements IHumanFactroy {
    @Override
    public IHuman createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public IHuman createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
