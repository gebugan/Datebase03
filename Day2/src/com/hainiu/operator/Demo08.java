package com.hainiu.operator;

import java.util.Random;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-28 11:01
 */
public class Demo08 {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();

        //获得随机数
        for (int i = 0;i <10;i++){
            int num = r.nextInt(10);
            System.out.println(num);
        }




    }
}
