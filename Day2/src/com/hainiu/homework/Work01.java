package com.hainiu.homework;

import java.util.Scanner;

/**
 * @program: Text
 * @description:三元运算符获取三个数的最大值
 * @author: 小戈
 * @create: 2023-03-28 17:55
 * 1.输入三个数字
 * 2.第一个和第二个数字比大小，大的数字赋值给一个新的变量
 * 3.用这个新的变量在和第三个数字比大小
 * 4.输出最大的数字
 */
public class Work01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int one = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int two = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int three = sc.nextInt();
        //进行数字比较
        int a = one > two ? one : two;
        int b = a > three ? a : three;
        //输出
        System.out.println("数字最大的为：" + b);

    }
}
