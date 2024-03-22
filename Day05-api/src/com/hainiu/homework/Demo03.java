package com.hainiu.homework;

import java.util.Arrays;

/**
 * @program: Text
 * @description:
 *     String s = "11 110   20  25  18  17  15  22"
 *     将其中的整数按照大小排序（Arrays.sort()）,组成一个新的字符串。
 * 1,将字符串切割成字符串数组，用String类的split方法：String[] split(String regex)；
 * 2,将字符串转换成数字并将其存储在一个等长度的int数组中
 * 3,排序，Arrays类的sort方法，需要导入相应类
 * 4,将排序后的结果遍历并拼接成一个字符串
 *     拆分成字符串数组
 *     字符串数组转换为整数数组
 *     排序
 *     再把整数数组拼接成字符串（StringBuilder）
 * @author: 小戈
 * @create: 2023-04-02 16:36
 */
public class Demo03 {
    public static void main(String[] args) {
        String s = "11 110 20 25 18 17 15 22";
        //切割字符串；将字符串切割成字符串数组，用String类的split方法：String[] split(String regex)；
        String []ste = s.split(" ");
        //动态初始化数组
        int[] arr = new int[ste.length];
        //遍历字符串数组个数
        for (int i = 0; i < arr.length; i++) {
            //将数字字符转化成数字
            arr[i] = Integer.parseInt(ste[i]);
        }
        //排序
        Arrays.sort(arr);
        //转义成字符串
        String  a = Arrays.toString(arr);
        System.out.println(a);
        //pai(arr);

//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            //System.out.print(arr[i]+ "\t");
//            //append  追加Object参数的字符串表示形式
//            sb.append(arr[i] + " ");
//        }
//        //将数组转化成字符串
//        String arr1 = sb.toString();
//        System.out.println(arr1);




    }

    //排序法
    public static void pai(int[] arr){
        int e;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]){
                    e = arr[i];
                    arr[i] = arr[j];
                    arr[j] = e;
                }
            }
        }
    }



}
