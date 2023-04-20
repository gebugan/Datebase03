package com.hainiu.homework;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: Text
 * @description:键盘录入一个字符串 统计其中的英文字母有多少个？
 * @author: 小戈
 * @create: 2023-04-07 19:27
 */
public class Dema01 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String arr = sc.nextLine();
        number(arr,a,b);


//         String s = "aabbccddeeffgg";
//         String k = "a5sffs55a";
//
//         String st = new String(k);
//         Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String srr = sdf.format(date);
//        for (int i = 0; i < srr.length(); i++) {
//            System.out.print(srr.charAt(i));
//
//        }
        //System.out.println(date.getTime());

        // System.out.println(st.compareTo(s));

        //System.out.println(st.substring(2, 6));

//         char[] arr = new char[10];
//        for (int i = 0; i < s.length(); i++) {
//           arr[i] = s.charAt(i);
//           System.out.print(s.charAt(i));
//
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }



    }
    public static void number(String arr,int a,int b){

        int c = 0;
        int d = 0;
        char aa = 0;
        for (int i = 0; i < arr.length(); i++) {
            aa = arr.charAt(i);
            if((aa >= 'a' && aa <='z')||(aa >= 'A' && aa <='Z') ){
                c++;
            }else if (aa >= '0' && aa <= '9'){
                d++;
            }

        }
        System.out.println(c);
        System.out.println(d);



    }

















}
