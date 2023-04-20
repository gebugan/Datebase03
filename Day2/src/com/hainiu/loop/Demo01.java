package com.hainiu.loop;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 14:34
 */
public class Demo01 {
    public static void main(String[] args) {


        for (int i = 1;i <= 5; i++){
            System.out.println("hello world"+ i);
        }

        System.out.println("-----------------");

        //输出1-5
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("------------------");

        //求和
        int sum =0;
        for (int i = 1; i <= 5; i++){
            sum = sum + i;
        }
        System.out.println(sum);










    }
}
