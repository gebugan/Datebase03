package com.hainiu.homework;

import java.util.Scanner;

/**
 * @program: Text
 * @description: 模拟用户登录
 * @author: 小戈
 * @create: 2023-04-01 20:44
 * 1.录入用户名和用户密码
 * 2.与系统存入的用户名和密码做比较
 * 3.循环判断5次机会
 * 4，成功输出
 */
public class Demo02 {
    public static void main(String[] args) {
        String root = "zhangsan";
        String  word = "123456";

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {

            System.out.println("请输入用户名：");
            String root01 = scanner.nextLine();
            System.out.println("请输入密码：");
            String word01 = scanner.nextLine();

            if (root.equals(root01) && word.equals(word01)){
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("登陆失败，请重新登录，您还有" + (5-i) + "次机会");
            }
        }
        System.out.println("您的次数已用尽");

    }
}
