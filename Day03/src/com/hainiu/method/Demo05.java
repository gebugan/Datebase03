package com.hainiu.method;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 15:23
 * 参数：int[] arr
 * 返回值： int
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {3,65,88,97,22,5,59};
        int get = getMax(arr);
        System.out.println(get);

    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                int a = max;
                max = arr[i];
                arr[i] = a;
            }
        }
        return max;
    }











































}
