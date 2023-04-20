package com.hainiu.method;

import java.util.Random;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 15:17
 */
public class Demo04 {
    public static void main(String[] args) {
        int num = getRandomNumber();
        System.out.println(num);
        System.out.println(getRandomNumber());

    }
    public static int getRandomNumber(){
        //借助其他对象解决
        Random random = new Random();
        int num = random.nextInt(100) +1;

        return num;

    }




















}
