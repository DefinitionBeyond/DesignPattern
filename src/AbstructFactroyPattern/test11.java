package AbstructFactroyPattern;

import org.junit.Test;

/**
 * @author liutao
 * @date 2018/1/1  16:58
 */
public class test11 {
    @Test
    public void go() {

        //两条工厂第一生产线
        IHumanFactroy maleFactroy = new MaleFactroy(); // 男性工厂线
        IHumanFactroy femaleFactroy = new FemaleFactroy(); // 女性工厂线

        // 黄种人 生产
        IHuman maleYellowHuman = maleFactroy.createYellowHuman();
        IHuman femaleYellowHuman = femaleFactroy.createYellowHuman();

        //黑种人 生产
        IHuman maleBlackHuman = maleFactroy.createBlackHuman();
        IHuman femaleBlackHuman = maleFactroy.createBlackHuman();

        maleBlackHuman.getSex();
        maleBlackHuman.getColor();
        maleBlackHuman.talk();

        femaleBlackHuman.getSex();
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();

        maleYellowHuman.getSex();
        maleYellowHuman.getColor();
        maleYellowHuman.talk();

        femaleYellowHuman.getSex();
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();


    }
}
