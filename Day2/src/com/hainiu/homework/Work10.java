package com.hainiu.homework;

import java.util.Scanner;

/**
 * @program: Text
 * @description:20元，买可乐，3元一瓶，一个空瓶子能退1元，请问能买多少瓶？？ 不允许赊账。
 * @author: 小戈
 * @create: 2023-03-28 19:37
 * 1.方程计算20/3=i;a=i+(20%3);a/3=b;b=a+(a%3)
 * 2.减法计算x-3,累加次数，循环跳出
 *
 */
public class Work10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //大循环，保证数据输错后可以继续输入
        while (true) {
            //存入数据
            System.out.println("请输入买可乐的总金额：");
            int money = sc.nextInt();
            int count = 0;
            //保证数据为可用数据，进入while内循环，计入次数，
            while (money >= 0) {
                money = money - 3;
                count++;
                money = money + 1;
                //判断能否继续循环
                if (money < 3 && money >= 0) {
                    System.out.println("还剩" + money + "元");
                    break;
                }
            }
            //提示输入数据不合法
            if (money < 0) {
                System.out.println("您输入的金额错误，请重新输入：");
            }
            //数据合法计算后输出值，程序停止
            if (money < 3 && money >= 0) {
                System.out.println("一共可以购买" + count + "瓶可乐");
                break;
            }
        }
    }
}
