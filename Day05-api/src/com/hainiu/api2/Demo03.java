package com.hainiu.api2;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-01 10:49
 */
public class Demo03 {
    public static void main(String[] args) {
        //键盘录入字符串，统计其中的英文字母有多少个
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文本：");
        String s = sc.nextLine();//获取一行数据

        //计数器
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                count++;
            }
        }
        System.out.println(count);
    }









































}
