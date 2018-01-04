package ApdaterPattern.ClassAdapter;


/**
 * @author liutao
 * @date 2018/1/4  10:16
 */
public class Adapter extends Adaptee implements Robot {

    @Override
    public void cry() {
        System.out.println("机器人学习：");
        super.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人移走：");
        super.have();
    }
}
