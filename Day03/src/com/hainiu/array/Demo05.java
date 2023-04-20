package com.hainiu.array;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 10:39
 */
public class Demo05 {
    public static void main(String[] args) {
        //定义一个数组，求所有和
        int[] arr = new  int[] {10,20,30,42,50,55,92,12,44,9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
