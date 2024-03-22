package com.hainiu.operator;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 10:26
 */
public class Demo06 {
    public static void main(String[] args) {
        //交换两个变量的值
        int a = 1;
        int b = 2;

        int c = a;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------");

        //不定义第三方变量
        a = a^b;
        b = a^b;
        a = a^b^b;





    }
}
