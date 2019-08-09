package com.monster.zhaqsq.test;

public class calculator {
    int a;
    int b;

//    构造函数
    calculator(int x, int y){
        a = x;
        b = y;
    }

//    加法
    public static int add(int x, int y){
        return (x + y);
    }

//    减法
    public static int minus(int x, int y){
        return (x - y);
    }

//    乘法
    public static int multiply(int x, int y){
        return (x * y);
    }

//    除法
    public static int divide(int x, int y){
        return (x / y);
    }

//    main函数
    public static void main(String args[]){
        System.out.println("--------------欢迎使用小天才计算器--------------------");
        System.out.println("-------------------加法请按1--------------------------");
        System.out.println("-------------------减法请按2--------------------------");
        System.out.println("-------------------乘法请按3--------------------------");
        System.out.println("-------------------除法请按4--------------------------");
//        switch case语句
        System.out.println("请输入第一个数字");
        System.out.println("请输入第二个数字");
//        初始化构造函数calculator()
//        输出结果
    }
}
