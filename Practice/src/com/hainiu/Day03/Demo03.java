package com.hainiu.Day03;

/**
 * @program: Text
 * @description:方法调用
 * @author: 小戈
 * @create: 2023-03-29 14:16
 */
public class Demo03 {
    public static void main(String[] args) {
        nineTable();
    }
    /**
     * 无参数无返回值的构造方法
     */
    public static void nineTable(){
        for (int i = 0; i <= 9 ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();

        }

    }
    /**
     * 带参数无返回值的方法
     */











}
