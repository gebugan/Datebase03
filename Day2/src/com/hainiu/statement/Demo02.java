package com.hainiu.statement;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 11:45
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age =sc.nextInt();

        //判断
        if (age >= 18){
            System.out.println("可以出去");
        }else{
            System.out.println("回家");
        }












    }
}
