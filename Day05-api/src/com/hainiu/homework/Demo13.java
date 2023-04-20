package com.hainiu.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: Text
 * @description: 正在表达式的获取功能
 * @author: 小戈
 * @create: 2023-04-02 19:40
 */
public class Demo13 {
    public static void main(String[] args) {
        // 将下面文本中的手机号码全部获取出来
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        //校验获取模式对象
        Pattern pattern = Pattern.compile("1[3456789]\\d{9}");

        //
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            String s = matcher.group();
            System.out.println(s);
        }



    }
}
