package com.hainiu.Day03;

/**
 * @program: Text
 * @description:冒泡排序
 * @author: 小戈
 * @create: 2023-03-29 20:18
 */
public class Demo10 {
    public static void main(String[] args) {

        int[] arr = {1,5,66,9,32,4,52,62,78};
        maopao(arr);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }

    public static void maopao(int[] arr){
        //外循环，确定循环次数
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //作比较，大的往后移
                if (arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }





}
