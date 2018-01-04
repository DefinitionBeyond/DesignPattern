package ApdaterPattern.ObjectAdapter;

/**
 * @author liutao
 * @date 2018/1/4  11:48
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void cry() {
        System.out.println("机器人学习：");
        adaptee.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人移走：");
        adaptee.have();
    }
}
