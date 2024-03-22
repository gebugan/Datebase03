package com.hainiu.array2;

/**
 * @program: Text
 * @description:
 * 二维数组存储一维数组
 * 储存的全是一维数组的引用
 * @author: 小戈
 * @create: 2023-03-30 11:57
 */
public class Demo02 {
    public static void main(String[] args) {

        int[][] arr =new  int[3][];
        //二维数组长度为3，但目前没有一维数组，储存了三个null
        System.out.println(arr[0]);

        //定义了一维数组储存进去
        int[] arr1 ={1,2,3};
        //为二维数组的第一个索引位置赋值
        arr[0] = arr1;
        System.out.println(arr[0]);//输出索引地址











    }
}
