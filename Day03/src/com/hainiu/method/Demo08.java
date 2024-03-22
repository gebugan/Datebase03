package com.hainiu.method;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 16:29
 */
public class Demo08 {
    public static void main(String[] args) {
        divide(1.5,3,2);
    }
    public static void divide(double a,double b,int scale){
        if (scale < 0){
            return;
        }
        System.out.println(a/b);
    }
}
