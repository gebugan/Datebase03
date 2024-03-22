package com.hainiu.api2;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

/**
 * @program: Text
 * @description:字符串的遍历与比较
 * @author: 小戈
 * @create: 2023-04-01 10:55
 */
public class Demo04 {
    public static void main(String[] args) {
        //比较方法
        //模拟用户登录
        String usename = "admin";
        String password = "123456";

        //键盘录入
        Scanner sc = new Scanner(System.in);
        //循环 5次
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String word = sc.nextLine();

            //判断
            if (usename.equals(name) && password.equals(word)){
                System.out.println("输入正确");
                break;
            }else {
                System.out.println("输入错误,还剩" +(5- i) + "次机会");
            }
        }













    }
}
