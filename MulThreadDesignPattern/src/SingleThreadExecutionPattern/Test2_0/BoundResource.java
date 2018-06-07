package SingleThreadExecutionPattern.Test2_0;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author liutao
 * @date 2018/6/7  9:48
 */
public class BoundResource {
    private final Semaphore semaphore;
    private final int permite;
    private final static Random random = new Random(314567);

    public BoundResource(int permite) {
        this.semaphore = new Semaphore(permite);
        this.permite = permite;
    }

    public void ues() throws InterruptedException {
        semaphore.acquire();
        try {
            doUse();
        } finally {
            semaphore.release();
        }
    }

    private void doUse() throws InterruptedException {
        Log.println("begin: used = " + (permite - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("end: used = " + (permite - semaphore.availablePermits()));
    }
}
