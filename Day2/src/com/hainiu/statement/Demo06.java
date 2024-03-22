package com.hainiu.statement;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 12:21
 */
public class Demo06 {
    public static void main(String[] args) {
        //break省略之后可能会出现case穿透现象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份（1-12）：");
        int month = sc.nextInt();
        //判断
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入月份有误");
        }


    }

}
