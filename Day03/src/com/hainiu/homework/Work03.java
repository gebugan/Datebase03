package com.hainiu.homework;

import java.util.Scanner;

/**
 * @program: Text
 * @description:3、普通查找
 * @author: 小戈
 * @create: 2023-03-30 19:39
 */
public class Work03 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出要查找的数字：");
        int a = sc.nextInt();
        //调用idea
        idea(a,arr);

    }

    /**
     * 普通查找方法
     * @param a
     * @param arr
     */
    public static void idea(int a,int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]){
                System.out.println("已经查找成功,数字在数组位置为" + (count+1));
                break;
            }
            count++;
        }

    }

    /**
     * 二分查找
     */









}
