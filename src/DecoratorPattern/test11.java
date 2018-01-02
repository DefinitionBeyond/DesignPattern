package DecoratorPattern;

import org.junit.Test;

/**
 * @author liutao
 * @date 2018/1/2  15:06
 */
public class test11 {
    @Test
    public void go() {
        String password = "LiuTaoTest"; //明文密码
        String cpassword; // 加密之后密码

        Cipher sc = null; //简单加密
        Cipher cc = null; //复杂加密
        Cipher ac = null; //高级加密

        sc = new SimpleCipher();
        cpassword = sc.encrypt(password);
        System.out.println(cpassword);

        System.out.println(password);

        cc = new ComplexCipher(sc); // 在简单加密的基础上反转密文
        cpassword = cc.encrypt(password);
        System.out.println(cpassword);
        System.out.println(password);

        ac = new AdvanceCipher(cc);
        cpassword = ac.encrypt(password); //反转之后，对每位结果取模
        System.out.println(cpassword);
        System.out.println(password);


    }
}
