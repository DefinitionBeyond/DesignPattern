package SingleThreadExecutionPattern.Test2_0;

import java.util.Random;

/**
 * @author liutao
 * @date 2018/6/7  10:07
 */
public class UseResource implements Runnable {
    private final static Random random = new Random(26536);
    private BoundResource resource;

    public UseResource(BoundResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resource.ues();
                Thread.sleep(random.nextInt(4000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
