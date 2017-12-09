package SinglePattern;

/**
 * @author liutao
 * @date 2017/12/9  11:11
 */

/**
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * <p>
 * 使用枚举实现的单例模式，不但可以防止利用反射强行构造单例子对象
 * 而且枚举类对象在被反序列化的时候，保证反序列的返回结果是同一对象
 * <p>
 * 对于其他方法实现单例模式，如果既想要做到可序列化，又想反序列化为同一对象
 * 则必须实现readResolve方法
 */
public enum singlePattern6 {
    INSTANCE;

    public void whateverMethod() {
        System.out.println("ok");
    }
}
