package DecoratorPattern;

/**
 * @author liutao
 * @date 2018/1/2  15:03
 */
public class AdvanceCipher extends CipherDecorator {
    public AdvanceCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText) {
        String result = super.encrypt(plainText);
        result = mod(result);
        return result;
    }

    // 对密文取模
    private String mod(String result) {
        String str = "";
        for (int i = 0; i < result.length(); i++) {
            str += String.valueOf(result.charAt(i) % 5);
        }
        return str;
    }


}
