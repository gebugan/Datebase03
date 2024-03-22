package com.hainiu.apidemo;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 10:42
 */
public class Demo01 {
    public static void main(String[] args) {
        //键盘录入创建对象
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入一个整数：");

        //使用对象调用功能 方法
        //定义一个变量，接受方法返回值
        //InputMismatchException输入不为整数，则异常
        int i = sc.nextInt();

        System.out.println(i);

    }
}
