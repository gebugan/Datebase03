package com.hainiu.loop;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 15:25
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        while (true) {
            if (score >= 0 && score <= 100) {
                System.out.println("录入成绩正确");
                break;
            } else {
                System.out.println("错误");
                break;
            }
        }




    }
}
