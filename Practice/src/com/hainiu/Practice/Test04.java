package com.hainiu.Practice;

/**
 * @program: Text
 * @description: 二分查找有序数组
 * @author: 小戈
 * @create: 2023-04-09 18:19
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int bb = 10;
        math(arr,bb);
    }
//    public static int binarySearch(int[] arr, int value) {
//        // 查找的范围
//        int start = 0;
//        int end = arr.length - 1;
//        // 循环查找
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (arr[mid] < value) {
//                // 如果值大，查询的起始索引改变
//                start = mid + 1;
//            } else if (value < arr[mid]) {
//                // 如果值小，查询的结束索引改变
//                end = mid - 1;
//            } else {
//                // 找到了 返回索引
//                return mid;
//            }
//        }
//        // 循环结束没有return，没找到，返回 负的插入点-1
//        return -(start + 1);
//    }


    public static void math(int[] arr,int bb){

        int first = 0;
        int end = arr.length -1 ;//长度长度长度

        while (first <= end) {
            int zhong = (first + end)/2;
            if (arr[zhong] < bb) {
                first = zhong + 1;
            } else if (arr[zhong] > bb) {
                end = zhong - 1;
            }else {
                System.out.println("位置在" + arr[zhong]);
                break;
            }
        }

    }

}
