package com.hainiu.array;

/**
 * @program: Text
 * @description:数组反转案例
 * @author: 小戈
 * @create: 2023-03-30 11:02
 */
public class Demo07 {
    public static void main(String[] args) {
        int[] arr2 = {1,2,3,4,5,6,7};

        int start = 0;
        int end = arr2.length - 1;
        while ( start < end){
            int t = arr2[start];
            arr2[start] = arr2[end];
            arr2[end] = t;
            start++;
            end--;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }


    }
}
