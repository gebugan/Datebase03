package com.hainiu.homework;


/**
 * @program: Text
 * @description:小牛买了一个存钱罐，他计划这样存钱：第一周存入10元，第二周存入20元，第三周存入30，依次每周递增10元。
 *   请编写程序帮助小牛计算一下，一年（一年52周）之后，他的存钱罐中有多少钱？
 * @author: 小戈
 * @create: 2023-03-28 19:36
 * 1.存款总数为sum，为累加的数
 * 2.变量赋值
 * 3.for循环
 */
public class Work07 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 53; i++) {

            sum = sum + (10 * i);

        }
        System.out.println("小牛一年之后，他的存钱罐中有：" + sum + "元");
    }
}
