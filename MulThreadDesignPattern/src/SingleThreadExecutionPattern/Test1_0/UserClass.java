package SingleThreadExecutionPattern.Test1_0;

/**
 * @author liutao
 * @date 2018/6/7  8:38
 */
public class UserClass implements Runnable {
    private String name;
    private String address;
    private Gate gate;

    public UserClass(String name, String address, Gate gate) {
        this.name = name;
        this.address = address;
        this.gate = gate;
    }

    @Override
    public void run() {
        while (true) {
            gate.pass(name, address);
        }
    }
}
