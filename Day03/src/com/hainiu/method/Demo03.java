package com.hainiu.method;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 15:10
 * 参数列表 int[] arr
 * 返回值 void
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {3,5,6,9,8};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        //打印半个方括号 不换行
        System.out.print("[");

        //遍历元素 打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


        System.out.println("]");
    }















































}
