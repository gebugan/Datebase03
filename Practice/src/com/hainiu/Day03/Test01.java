package com.hainiu.Day03;

import java.util.Random;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-03 09:07
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
//        int[] arr1 = {1,2,3,4,5,55,66,22,7};
//        int e = max(arr1);
//        System.out.println(e);

        int[] b =shu(arr);
        int max = max(b);
        System.out.println();
        System.out.println(max);
        
    }
    //获取数组
    public static int[] shu(int[] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length ; i++) {
            int b =r.nextInt(100);
            arr[i] = b;
            System.out.print(arr[i] + "\t");
        }
        return arr;
    }
    //找最大值
    public static int max(int[] arr){
        int c = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (c < arr[i]){
                c = arr[i];
            }
        }

        return c;
    }
    
    
}
