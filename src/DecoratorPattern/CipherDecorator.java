package DecoratorPattern;

/**
 * @author liutao
 * @date 2018/1/2  14:51
 */

/**
 * 加密装饰类
 * 抽象装饰类
 * <p>
 * 继承该装饰类的对象都是具体装饰类
 */
public class CipherDecorator implements Cipher {
    private Cipher cipher;

    public CipherDecorator(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }
}
