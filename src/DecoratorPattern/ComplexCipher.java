package DecoratorPattern;

/**
 * @author liutao
 * @date 2018/1/2  14:57
 */
public class ComplexCipher extends CipherDecorator {
    public ComplexCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText) {
        String result = super.encrypt(plainText);
        result = reverse(result);
        return result;
    }

    // 反转密文
    private String reverse(String result) {
        String str = "";
        for (int i = result.length() - 1; i > 0; i--) {
            str += result.substring(i - 1, i);
        }
        return str;
    }
}
