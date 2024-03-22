package com.hainiu.Day03;

import java.util.Scanner;

/**
 * @program: Text
 * @description:数组高级查找
 * 定义方法实现，查找某元素在数组中第一次出现的位置（索引），如果没有，返回-1。
 * @author: 小戈
 * @create: 2023-03-29 17:04
 */
public class Demo08 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {13,5,64,99,52,444,5,56,88,13,88};
        Scanner sc = new Scanner(System.in);
        //调用select无返回值的构造方法，用来显示数字
        select(arr);
        System.out.println("请输入要查找的数字：");
        int number = sc.nextInt();
        //将带参有返回值的select方法传回给b
        int b = select(arr,number);
        System.out.println("我是被select方法返回赋值的" + b);

    }
    //有参数有返回值的构造方法
    public static int select(int[] arr,int number){

        int count = 0;
        int c = 0;
        if(arr == null){
            System.out.println("非法错误");
        }
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                c = number;
                System.out.println("该数在数组中第一次出现的位置为：" + (i+1));
                //找到结束，跳出
                break;
            }
            count++;
        }
        //判断录入数字是否存在于数组中
        if (count == arr.length){
            System.out.println("该数字在数组中不存在");
            return -1;
        }

        return c;
    }
    //无返回值有参数的空的select构造方法
    public static void select(int[] arr){

        //显示数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
