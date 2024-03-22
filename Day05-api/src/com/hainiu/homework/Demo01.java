package com.hainiu.homework;

import java.util.Scanner;

/**
 * @program: Text
 * @description:键盘录入一个字符串 统计其中的英文字母有多少个？
 * @author: 小戈
 * @create: 2023-04-01 20:21
 * 1.存储输入的字符串
 * 2.使用String类的charAt方法
 * 3.循环输出字符串的字母，计数
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段英文字符串：");
        String str = sc.nextLine();
        //设置循环值
        int count = 0;
        //遍历利用charAt方法循环输出字符串的每个字母
        for (int i = 0; i < str.length(); i++) {

            //public char charAt(int index)
            //获取指定索引处的字符，索引范围从0到length() - 1 。
            char a = str.charAt(i);
            //判断是否为字母
            if ((a >= 'a' && a <= 'z')||(a >= 'A' && a <= 'Z')){
                count++;
            }
        }

        System.out.println("该一段英文字符串个数为：" + count);


    }
}
