package com.hainiu.Practice;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-08 15:44
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入一组数字并用空格隔开");
        String write = sc.nextLine();
        int[] arr = a(write);
        System.out.println("请输入运算的值");
        int target = sc.nextInt();

        int[] ff =twoSum(arr,target);
        System.out.print("[");
        for (int i = 0; i < ff.length; i++) {
            if (i == (ff.length-1)){
                System.out.print(ff[i]);
            }else {
                System.out.print(ff[i] + ",");
            }
        }
        System.out.print("]");

    }
    public static int[] a(String write){

        String[] zizu = write.split("\\ ");
        int[] shuzu = new int[zizu.length];
        for (int i = 0; i < zizu.length; i++) {
            shuzu[i] = Integer.parseInt(zizu[i]);
        }
        return shuzu;
    }


    public static int[] twoSum(int[] nums, int target) {

        int count =0;
        int [] two =new int[10];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target){
                    two[count] = nums[i];
                    int a = count + 1;
                    two[a] = nums[j];
                    count = count + 2;
                }
            }
        }

        return two;
    }
}


/**
 * public static int binarySearch(int[] arr, int value) {
 *     // 查找的范围
 *     int start = 0;
 *     int end = arr.length - 1;
 *     // 循环查找
 *     while (start <= end) {
 *         int mid = (start + end) / 2;
 *         if (arr[mid] < value) {
 *             // 如果值大，查询的起始索引改变
 *             start = mid + 1;
 *         } else if (value < arr[mid]) {
 *             // 如果值小，查询的结束索引改变
 *             end = mid - 1;
 *         } else {
 *             // 找到了 返回索引
 *             return mid;
 *         }
 *     }
 *     // 循环结束没有return，没找到，返回 负的插入点-1
 *     return -(start + 1);
 * }
 */


