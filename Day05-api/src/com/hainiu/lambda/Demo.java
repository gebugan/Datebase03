package com.hainiu.lambda;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-01 09:12
 */
public class Demo {

    public static void main(String[] args) {

        //lambda表达式只针对 函数式接口（有且仅有一个抽象方法的接口）
        //（）为接口重写的形式参数
        //
        goSwimming(() -> {
            System.out.println("游泳");
        });


    }

    public static void goSwimming(swimming swimming){

        swimming.swim();
    }










































}
