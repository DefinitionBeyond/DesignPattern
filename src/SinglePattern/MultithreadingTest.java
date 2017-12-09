package SinglePattern;

import org.junit.Test;

/**
 * @author liutao
 * @date 2017/12/9  11:53
 */
public class MultithreadingTest {

    class MyThread {
        public Thread createThred(int id) {
            Thread thread = null;
            thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    for (int i = 0; i < 4; i++) {
//                        System.out.println(Thread.currentThread().getName()+"  ===  "+singlePattern1.getInstance());
//                        System.out.println(Thread.currentThread().getName()+"  ===  "+singlePattern2.getInstance());
//                        System.out.println(Thread.currentThread().getName()+"  ===  "+singlePattern3.getInstance());
//                        System.out.println(Thread.currentThread().getName()+"  ===  "+singlePattern4.getInstance());
//                        System.out.println(Thread.currentThread().getName()+"  ===  "+singlePattern5.getInstance());
//                        System.out.println(Thread.currentThread().getName()+"  ===  ");
//                        singlePattern6.INSTANCE.whateverMethod();
                        System.out.println(Thread.currentThread().getName() + "  ===  " + singlePattern7.getInstance());
                    }
                }
            });
            return thread;
        }
    }

    @Test
    public void test1() {
        for (int i = 0; i < 5; i++) {
            Thread t = new MyThread().createThred(i);
            t.start();
            t.setName("Thread " + (i + 1));
        }
    }

}
