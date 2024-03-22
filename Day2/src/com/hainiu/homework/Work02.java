package com.hainiu.homework;

import java.util.Scanner;

/**
 * @program: Text
 * @description:对输入的成绩作出判断 属于哪个等级
 * @author: 小戈
 * @create: 2023-03-28 19:31
 * 1.成绩录入
 * 2.利用if语句判断
 */
public class Work02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入考试成绩：");
        int grade = sc.nextInt();
        while (grade >= 0 && grade <= 100){
            if (grade > 90){
                System.out.println("A");break;
            }else if (grade > 80){
                System.out.println("B");break;
            }else if (grade > 70){
                System.out.println("C");break;
            }else if (grade > 60){
                System.out.println("D");break;
            }else {
                System.out.println("不及格");break;
            }


        }
//        if (grade < 0 || grade > 100){
//            System.out.println("您输入的成绩有误，请重新输入：");
//        }

    }
}
