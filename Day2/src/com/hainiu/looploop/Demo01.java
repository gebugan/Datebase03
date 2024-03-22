package com.hainiu.looploop;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 17:19
 * 打印长方形
 */
public class Demo01 {
    public static void main(String[] args) {
//        for (int i = 1; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            //内循环结束换行
//            System.out.println();
//        }
/**
 * 打印三角形
 * *
 * **
 * ***
 * ****
 * *****
 */
//        for (int i = 1; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            //内循环结束换行
//            System.out.println();
//        }

//99乘法表
        for (int i = 1;i <= 9;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }























    }
}
