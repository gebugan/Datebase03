package com.hainiu.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @program: Text
 * @description:正则表达式的校验功能
 * @author: 小戈
 * @create: 2023-04-02 19:16
 */
public class Demo11 {
    public static void main(String[] args) {
        String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入邮箱：");
            String email = sc.nextLine();

            //email.matches(regex)判断是否相同
            if (email.matches(regex)) {
                System.out.println("输入格式正确");
                break;
            } else {
                System.out.println("输入格式错误请重新输入");
            }
        }
    }

}
