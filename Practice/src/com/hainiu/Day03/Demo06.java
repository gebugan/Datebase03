package com.hainiu.Day03;

/**
 * @program: Text
 * @description:带参数有返回值的方法
 * @author: 小戈
 * @create: 2023-03-29 15:32
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {12,5,95,64,55,21,2,45};
        int a = practice(arr);
        System.out.println(a);

    }


    public static int practice(int[] arr){

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
}
