package com.hainiu.operator;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 09:17
 */
public class Demo01 {
    public static void main(String[] args) {

        String name = "Tome";

        System.out.println("my name is " + name);

        int age = 18;
        System.out.println("我的年龄是" + age);

        //注意运算规则
        System.out.println(10 + 20 + "name" + 10 + 20);

        //整型int运算不会出现小数
        int a = 10;
        int b = 3;
        System.out.println(a/b);

    }
}
