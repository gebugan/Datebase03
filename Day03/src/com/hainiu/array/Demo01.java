package com.hainiu.array;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 09:24
 * 数组动态初始化
 */
public class Demo01 {
    public static void main(String[] args) {
        //整数数组;数组本身为引用数据类型
        //定义长度为3的整数数组
        int[] arr = new int[3];

        //访问数组
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //ArrayIndexOutOfBoundsException:数组越界异常
        //System.out.println(arr[3]);

        //赋值
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //打印数组本身
        System.out.println(arr);//[I@7f31245a为在内存地址经过哈希算算法转16进制的取值





















    }
}
