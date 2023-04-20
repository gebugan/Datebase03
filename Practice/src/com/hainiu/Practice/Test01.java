package com.hainiu.Practice;

import java.util.Arrays;

/**
 * @program: Text
 * @description:定义一组字符串数字，并排序
 * @author: 小戈
 * @create: 2023-04-08 14:37
 */
public class Test01 {
    public static void main(String[] args) {
        String a = "10 35 56 88 69 4 5 98";
        //切割字符串
        String [] zifu = a.split("\\ ");
        //定义转存数组
        int[] arr = new int[zifu.length];
        //循环存储
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(zifu[i]);
        }
        //排序数组
        Arrays.sort(arr);
        //数组转成字符串
        StringBuffer sb = new StringBuffer();

        //依次存入
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + "\t");
        }
        String ss =sb.toString();
        System.out.println(ss);










//        //切割字符串，专成字符数组
//        String[] arr = a.split("\\ ");
//        //新建整数数组
//        int [] brr = new int [arr.length];
//        //循环录入
//        for (int i = 0; i < arr.length; i++) {
//            brr[i] = Integer.parseInt(arr[i]);
//        }
//        //排序
//        Arrays.sort(brr);
//       //将数组再转化成字符串
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            sb.append(brr[i] + "\t");
//        }
//        String  c = sb.toString();
//        //输出字符串
//        System.out.println(c);
//        for (int i = 0; i < c.length(); i++) {
//            System.out.print(c.charAt(i) );
//        }






    }
}
