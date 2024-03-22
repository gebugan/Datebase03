package com.hainiu.homework;



/**
 * @program: Text
 * @description:2、数组反转
 * @author: 小戈
 * @create: 2023-03-30 19:38
 */
public class Work02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        work(arr);
        //顺序输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void work(int[] arr){
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            //判断前后
            if (i > arr.length - i ){
                System.out.println("循环完毕");
                return;
            }
            //换值
            a = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;
        }



    }




}
