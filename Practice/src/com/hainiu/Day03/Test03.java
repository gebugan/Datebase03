package com.hainiu.Day03;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-03 09:28
 */
public class Test03 {
    public static void main(String[] args) {
        double a = 100;
        double c = 0;
        double sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum = sum + c;
            c = a/2;
            a = c;
            System.out.println(c);
            sum = sum + c;
        }
        System.out.println("总高度为" + (sum + 100));
        System.out.println("最后一次的高度为" + c);

    }
}
