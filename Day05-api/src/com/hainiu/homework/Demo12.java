package com.hainiu.homework;

/**
 * @program: Text
 * @description: 正则表达式的替换功能
 * @author: 小戈
 * @create: 2023-04-02 19:26
 */
public class Demo12 {
    public static void main(String[] args) {
        // 将下面文本中的手机号码全部使用****代替replaceAll
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        String i = "1[3456789]\\d{9}";
        String q = str.replaceAll(i,"******");
        System.out.println(q);

        //第一个文本替换replaceFirst
        String str1 = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        String i1 = "1[3456789]\\d{9}";
        String q1 = str1.replaceFirst(i1,"******");
        System.out.println(q1);

    }
}
