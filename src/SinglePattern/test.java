package SinglePattern;

import org.junit.Test;

/**
 * @author liutao
 * @date 2017/12/9  10:36
 */
public class test {
    @Test
    public void test1() {
        System.out.println(singlePattern1.getInstance());
        System.out.println(singlePattern1.getInstance());
    }

    @Test
    public void test2() {
        System.out.println(singlePattern2.getInstance());
        System.out.println(singlePattern2.getInstance());
    }

    @Test
    public void test3() {
        System.out.println(singlePattern3.getInstance());
        System.out.println(singlePattern3.getInstance());
    }

    @Test
    public void test4() {
        System.out.println(singlePattern4.getInstance());
        System.out.println(singlePattern4.getInstance());
    }

    @Test
    public void test5() {
        System.out.println(singlePattern5.getInstance());
        System.out.println(singlePattern5.getInstance());
    }

    @Test
    public void test6() {
        singlePattern6.INSTANCE.whateverMethod();
//        System.out.println(singlePattern6.INSTANCE);
        singlePattern6.INSTANCE.whateverMethod();
//        System.out.println(singlePattern6.INSTANCE);
    }

    @Test
    public void test7() {
        System.out.println(singlePattern7.getInstance());
        System.out.println(singlePattern7.getInstance());
    }
}
