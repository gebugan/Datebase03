package com.hainiu.homework;

import java.util.Scanner;

/**
 * @program: Text
 * @description:4、二分查找
 * @author: 小戈
 * @create: 2023-03-30 19:39
 */
public class Work04 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出要查找的数字：");
        int a = sc.nextInt();
        //调用idea
        idea(a,arr);


    }

   public static void idea(int a,int[] arr){
        int first = 0;
        int end = arr.length;
        int count = 0;
       for (int i = 0; i < arr.length; i++) {
           int b = (first + end)/2;
           if (arr[b] < a ){
               first = first + b + 1;
           }else if(arr[b] > a){
               end = end - b - 1;
           }else {
               System.out.println("已经找到");
               break;
           }
           count++;
       }





   }




}
