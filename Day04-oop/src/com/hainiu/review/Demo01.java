package com.hainiu.review;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 09:12
 */
public class Demo01 {
    public static void main(String[] args) {
        //数组常见的工具类 Arrays 调用方法直接使用类名

        int[] arr = {1,2,3,4,5,6,7,8,9};
        //二分查找
        int i = Arrays.binarySearch(arr,5);
        System.out.println(i);

        //system类的方法
        /*
        src 源数组
        srcPos 源数组的起始位置
        dest 目标数组
        destPos 目标数组的起始位置
        length 拷贝长度

         */
        int[] newArr = new  int[arr.length];
        System.arraycopy(arr,1,newArr,2,5);
        System.out.println(Arrays.toString(newArr));

        //数组排序方法Array
        int[] array = {2,6,5,3,1,4,7,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


    }

























}
