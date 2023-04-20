package com.hainiu.loop;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 17:10
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * 程序自动生成1-100数字，能猜出来
         * 1.random生成随机数
         * 2.键盘录入对象
         * 3.循环猜
         */
        Random r = new Random();
        //0-99数字随机
        int a = r.nextInt(100);
        Scanner sc = new Scanner(System.in);

        //一直猜
        while (true){
            //不断循环
            System.out.println("请输入您猜的数字：");
            int num = sc.nextInt();

            //比较
            if (num < a){
                System.out.println("猜小了");
            }else if(num > a){
                System.out.println("猜大了");
            }else {
                System.out.println("猜中了");
                break;
            }

        }















    }
}
