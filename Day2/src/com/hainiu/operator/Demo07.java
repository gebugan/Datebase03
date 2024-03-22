package com.hainiu.operator;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 10:49
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int x = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int y = sc.nextInt();

        System.out.println("请输入第三个整数：");
        int z = sc.nextInt();

        int t = x > y ? x : y;
        int max = t > z ? t : z;
        System.out.println("最大值为："+ max);





    }
}
