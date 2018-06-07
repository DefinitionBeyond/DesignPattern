package SingleThreadExecutionPattern.Test1_0;

/**
 * @author liutao
 * @date 2018/6/7  8:55
 */
public class JCTGate extends Gate {
    private int age = 10;

    @Override
    public synchronized void pass(String name, String address) {
        super.pass(name, address);
        check();
    }

    private void check() {
        if (this.age < 12) {
            this.age++;
            System.out.println("age:" + age);
        }
    }
}
