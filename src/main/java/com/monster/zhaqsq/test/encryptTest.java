package com.monster.zhaqsq.test;

import com.monster.zhaqsq.utils.encryptUtils;

import java.util.Arrays;

/**
 * @auther: Monster
 * @date: 2019/8/11
 * @description:
 */
public class encryptTest {
    static byte[] key = {-22, -14, 74, -23, -29, 94, 103, 47};
    static String note = "123456";
    static byte[] message = note.getBytes();

    public static void main(String[] args) throws Exception{
        byte[] a = encryptUtils.encrypt(message,key);
        System.out.println(message + ">>>DES 加密结果>>>" + a.toString());
        byte[] b = encryptUtils.decrypt(a, key);
        System.out.println(a.toString() + ">>>DES 解密结果>>>" + new String(b));
    }
}