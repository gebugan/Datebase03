package com.hainiu.Practice;

import java.util.Random;

/**
 * @program: Text
 * @description:
 * 体彩中有一项是双色球，要求在1-33号共33个红色球里选出6个，
 * 1-16号共16个蓝色球中选出一个作为中奖号码，打印结果如下图所示，请实现这个需求。
 * @author: 小戈
 * @create: 2023-04-12 16:02
 */         
public class Exam02 {
    public static void main(String[] args) {
        int[] red = new int[33];
        int[] blue = new int[16];
        int[] six = new int[6];
        //把数字录入red中
        for (int i = 1; i < 34; i++) {
            red[i-1] = i;
        }
        //把数字录入biue中
        for (int i = 1; i < 17; i++) {
            blue[i-1] = i;
        }


        //获取A求6个号码
        int [] a = A(red);
        //获取B球号码
        int b = B(blue);
        //输出A球6个号码
        System.out.print("[");
        for (int i = 0; i < 33; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("]");
        //输出B求单个号码
        System.out.println(b);


    }
    /**
     * 获得双色求A的号码
     */
    public static int[] A(int[] arr){
        int[] six =new int[6];
        //定义返回数组

        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            six[i] = r.nextInt(6);
        }

        return six;
    }
    /**
     * 获取双色球B的号码
     */
    public static int B(int[] blue){
        int c = 0;
        //定义返回数组

        Random r = new Random();
        c = r.nextInt(1);

        return c;
    }
}
