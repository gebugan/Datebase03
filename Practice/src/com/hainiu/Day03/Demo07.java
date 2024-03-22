package com.hainiu.Day03;

/**
 * @program: Text
 * @description:参数传递形式
 * @author: 小戈
 * @create: 2023-03-29 15:54
 */
public class Demo07 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用方法前number为 ：" + number);
        //调用change方法值赋值新建变量a
        int a = change(number);
        System.out.println("调用方法后返回值为："+ a);
        //调用一个无参无返回值的空方法
        change();




    }
    public static int change(int number){

        number = 200;
        //System.out.println("调用方法后number为："+ number);
        return number;


    }
    public static void change(){
        System.out.println("这是一个空方法");
    }



}
