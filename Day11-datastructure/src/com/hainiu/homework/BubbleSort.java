package com.hainiu.homework;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Arrays;

/**
 * @program: Text
 * @description:冒泡大法
 * @author: 小戈
 * @create: 2023-04-10 21:31
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,6,99,2,15,365,51,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void bubbleSort(int[] arr){
        int a = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i ; j++) {
                if (arr[j] > arr[j + 1]){
                    a = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = a;
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
