package SingleThreadExecutionPattern.Test1_0;

/**
 * @author liutao
 * @date 2018/6/7  8:32
 */
public class Gate {
    private int count = 0;
    private String name;
    private String address;

    public synchronized void pass(String name, String address) {
        this.count++;
        this.name = name;
        this.address = address;
        check();
    }

    private void check() {
        if (this.name.charAt(0) != this.address.charAt(0)) {
            System.out.println("broken:" + toString());
        }
    }

    @Override
    public synchronized String toString() {
        return "No. " + this.count + ":" + this.name + "," + this.address;
    }
}
