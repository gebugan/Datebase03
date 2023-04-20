package com.hainiu.homework;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @program: Text
 * @description:定义方法实现，获取数组的一部分，
 * （需要的参数是：一个数组，一个开始索引 fromIndex，
 * 一个长度 len，实现的目标是从该索引fromIndex位置获  取，
 * 一共获取len个元素，组成一个新数组）
 * @author: 小戈
 * @create: 2023-03-30 19:39
 */
public class Work06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入截取位置：");
        int a = sc.nextInt();
        team(arr,a);
    }
    public static void team(int[] arr,int a){

        for (int i = a; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");
        }

    }


}
