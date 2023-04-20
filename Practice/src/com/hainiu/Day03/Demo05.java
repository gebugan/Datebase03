package com.hainiu.Day03;

import java.util.Random;

/**
 * @program: Text
 * @description:方法调用
 * @author: 小戈
 * @create: 2023-03-29 15:19
 */
public class Demo05 {
    public static void main(String[] args) {

        //调用random方法值，赋给a
        int a = random();
        System.out.println(a);


    }
    /**
     * 无参数带返回值的方法
     */
    public static int random(){

        Random r = new Random();
        int rum = r.nextInt(100);
        //返回随机数
        return rum;
    }
}
