package com.monster.zhaqsq.utils;

import org.junit.Test;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;


/**
 * @auther: Monster
 * @date: 2019/8/11
 * @description:
 */
public class encryptUtils {
    public static byte[] initKey() throws Exception{
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        keyGen.init(56);
        SecretKey secretKey = keyGen.generateKey();
        return secretKey.getEncoded();
    }
    public static byte[] encrypt(byte[] data, byte[] key) throws Exception{
        SecretKey secretKey = new SecretKeySpec(key, "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] cipherBytes = cipher.doFinal(data);
        return cipherBytes;
    }
    public static byte[] decrypt(byte[] data, byte[] key) throws Exception{
        SecretKey secretKey = new SecretKeySpec(key, "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] plainBytes = cipher.doFinal(data);
        return plainBytes;
    }
    public static void main(String[] args) throws Exception {
        byte[] desKey = encryptUtils.initKey();
        System.out.println("DES KEY : " + desKey);
        System.out.println(Arrays.toString(desKey));
        byte[] desResult = {'a','b','c'};
        System.out.println(desResult + ">>>DES 加密结果>>>" + encryptUtils.encrypt(desResult, desKey));
        byte[] desPlain = encryptUtils.decrypt(encryptUtils.encrypt(desResult, desKey), desKey);
        System.out.println(encryptUtils.encrypt(desResult, desKey) + ">>>DES 解密结果>>>" + new String(desPlain));
    }
}
