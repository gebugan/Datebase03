package com.hainiu.statement;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 12:10
 */

import java.util.Scanner;

/**
 * switch语句
 * 表达式、int、String、Eum枚举
 * @author wo
 */
public class Demo05 {
    public static void main(String[] args) {
        //模拟客服满意度 1.非常满意2.基本满意3.不太满意4.非常不满意
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入满意度（1-4）：");

        int num = sc.nextInt();
        //判断
        switch (num){
            case 1:
                System.out.println("非常满意");
                break;
            case 2:
                System.out.println("基本满意");
                break;
            case 3:
                System.out.println("不太满意");
                break;
            case 4:
                System.out.println("非常不满意");
                break;
            default:
                System.out.println("输入的满意度有误");
        }

























    }
}
