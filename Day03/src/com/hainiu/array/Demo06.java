package com.hainiu.array;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 10:42
 */
public class Demo06 {
    public static void main(String[] args) {
        //评委打分 键盘录入6个评委的分数（0-10）之间//去掉一个最低一个最高，其余取平均分，记录该选手最终得分
        //键盘录入
        Scanner sc  = new Scanner(System.in);

        //定义数组存储6个分数
        int[] arr = new int[6];

        //循环录入
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评为的分数");
            //录入的分数校验
            int score = sc.nextInt();
            if (score >= 0 && score <= 10){
                arr[i] = sc.nextInt();
            }else {
                System.out.println("录入错误");
                i--;
            }

        }
        //查找最高分
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }

        }
        //最低
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i]){
                min = arr[i];
            }

        }
        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        //求平均数
        System.out.println((sum - (min+max)) * 1.0/(arr.length - 2));




    }
}
