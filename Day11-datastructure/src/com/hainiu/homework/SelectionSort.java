package com.hainiu.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: Text
 * @description:选择排序基本大法
 * @author: 小戈
 * @create: 2023-04-10 21:43
 */
public class SelectionSort {
    public static void main(String[] args) {
        //生成1-100随机数并选择排序
        int[] arr = new int[100];
        Random ard = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ard.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int mark =i;//本轮第一个元素
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[mark]){
                    mark = j;
                }
            }
            if (mark != i){
               BubbleSort.swap(arr,mark,i);
            }
            count++;

        }
        System.out.println(count);
    }
}
