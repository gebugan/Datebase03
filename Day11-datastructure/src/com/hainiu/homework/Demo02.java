package com.hainiu.homework;

/**
 * @program: Text
 * @description:汉诺塔问题
 * @author: 小戈
 * @create: 2023-04-10 21:00
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(hn(6));
    }
    public static int hn(int n){
        if (n == 1){
            return 1;
        }
        return 2*hn(n-1) +1;
    }
}
