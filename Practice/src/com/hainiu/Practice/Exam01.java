package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * 一、某地有一个乞丐姓洪，去天桥要钱
 * 第一天要了1块钱2的0次
 * 第二天要了2块钱2的1次
 * 第三天要了4块钱2的2次
 * 第四天要了8块钱2的3次
 * 以此类推
 * 问题： 洪乞丐干10天，收入是多少？
 * @author: 小戈
 * @create: 2023-04-12 15:53
 */
public class Exam01 {
    public static void main(String[] args) {
        //从第二天开始获得的金钱是前一天的一倍
        int sum = 0;
        //循环遍历
        for (int i = 1; i <= 4; i++) {
            //每天累加，调用pow方法
            sum += Math.pow(2,i - 1);
        }

        //输出总和
        System.out.println(sum);
    }

}
