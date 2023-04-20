package com.hainiu.method;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 16:34
 */
public class Demo09 {
    public static void main(String[] args) {
        //调用方法会根据参数不同  自动匹配
        int[] arr = {};
        printArray(arr);

        double[] aArr = new double[3];
        printArray(aArr);

        //相似的方法采用重载实现，这样可以避免记忆大量的相似的方法名

    }
    //打印数组
    public static void printArray(int[] array){
        System.out.println(1);
    }
    //打印数组
    public static void printArray(double[] array){
        System.out.println(2);

    }


























}
