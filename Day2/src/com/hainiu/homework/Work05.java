package com.hainiu.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: Text
 * @description:猜数字小游戏
 * @author: 小戈
 * @create: 2023-03-28 19:33
 * 1.利用随机数random在1-100随机数字
 * 2.接受输入数字，对其进行与随机数进行比较
 * 3.while循环，猜对数字跳出
 */
public class Work05 {
    public static void main(String[] args) {
        Random ran = new Random();
        int r = ran.nextInt(100);
        Scanner sc = new Scanner(System.in);

//        System.out.println("请输入您要猜的数字：");老师这两行代码放外面为啥不行？？？？？？？？？？？？
//        int number = sc.nextInt();

        while (true){
            System.out.println("请输入您要猜的数字：");
            int number = sc.nextInt();
            if (r > number){
                System.out.println("小了");
            }else if (r < number ){
                System.out.println("大了");
            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }

    }


}
