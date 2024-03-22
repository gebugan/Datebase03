package com.hainiu.homework;

import java.util.Scanner;

/**
 * @program: Text
 * @description:1、评委打分案例（求最值 求和）
 * @author: 小戈
 * @create: 2023-03-30 19:38
 * 1.评委轮流打分，循环判断数据是否合法
 * 2.数组存储，去掉一个最高分，一个最低分
 * 3.求平均数
 */
public class Work01 {
    public static void main(String[] args) {

        //定义一个9个格子的数组
        double[] arr = new double[9];
        //调用Write方法，写入评委成绩
        Write(arr);
        //调用max方法返回值，赋值big
        double big = max(arr);
        //****
        double small = min(arr);
        //*****
        double zong = qiuHe(arr);

        //求取平均数
        double average = (zong - big - small)/(arr.length - 2);
        System.out.println("平均数为：" + average);
    }
    /**
     *  负责录入评为分数的方法，有参数无返回值
     */
    public static void Write (double[] arr){
        //录入数据
        Scanner sc = new Scanner(System.in);
        //循环录入数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个评委的分数");
            double a = sc.nextDouble();
            //判断数据是否合法
            if (a > 0 || a < 10 ){
                arr[i] = a;
            }else {
                System.out.println("您输入的分数有误，请重新输入：");
                i--;
            }
        }

    }
    /**
     * 遍历数组 ，选出最大值
     * 数组第一个元素赋值给a，遍历数组，比较大小
     */
    public static double max(double[] arr){
        double a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]){
                a = arr[i];
            }
        }

        return a;
    }
    /**
     * 选出最小值
     */
    public static double min(double[] arr){
        double b = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (b > arr[i]){
                b = arr[i];
            }
        }

        return b;
    }
    /**
     *求和
     * 遍历数组，家和
     */
    public static double qiuHe(double[] arr){
        double c = 0;
        for (int i = 0; i < arr.length; i++) {
            c = c + arr[i];
        }
        return c;
    }














}
