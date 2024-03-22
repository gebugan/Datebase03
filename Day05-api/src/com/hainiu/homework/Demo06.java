package com.hainiu.homework;

import java.util.Random;

/**
 * @program: Text
 * @description:判断一个字符串是否是回文
 * 一段很长的文本：
 * 查找符合要求（是英文字母或者空格）的连续子串，最长的那个。
 * sdfsdafsad!@#$SADFSDAF!@#$231sadfsadf123123sadf1234hello world
 * 记录找到的每个子串，与之前找到的比较。
 * @author: 小戈
 * @create: 2023-04-01 23:18
 */
public class Demo06 {
    public static void main(String[] args) {

        String str = "1234321";
        String str1 = "11234321";
        //调用方法传入的参数取决于主方法内的哪一个参数
        if (pc(str1) == true){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }

    }
    //String 后的a与前面无关
    public static boolean pc(String a){
        //调用StringBuffer构造方法
        //构造一个初始化为指定字符串内容的字符串构建器。 字符串构建器的初始容量为16加上字符串参数的长度。
        //public StringBuilder(String str)
        StringBuffer buffer = new StringBuffer(a);
        //反转
        buffer.reverse();
        //转化为字符串
        String rts = buffer.toString();
        //比较返回，***忽略大小写
        return rts.equals(a);

    }
}
