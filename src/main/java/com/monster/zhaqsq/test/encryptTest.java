package com.monster.zhaqsq.test;

import com.monster.zhaqsq.utils.encryptUtils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

/**
 * @auther: Monster
 * @date: 2019/8/11
 * @description:
 */
public class encryptTest {
    static byte[] key = {-22, -14, 74, -23, -29, 94, 103, 47};
    static String note = "asdf123654";
    static byte[] message = note.getBytes();

    public static void main(String[] args) throws Exception{
        byte[] a = encryptUtils.encrypt(message,key);
        System.out.println(message + ">>>DES 加密结果>>>" + encryptUtils.encrypt(message,key));
        byte[] b = encryptUtils.decrypt(a, key);
        System.out.println(a + ">>>DES 解密结果>>>" + new String(b));
    }
}
