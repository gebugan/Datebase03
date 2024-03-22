package com.hainiu.homework;

import java.util.Arrays;

/**
 * @program: Text
 * @description: 正则表达式的拆分功能
 * @author: 小戈
 * @create: 2023-04-02 19:53
 */
public class Demo14 {
    public static void main(String[] args) {
        String str = "11  22  33   44  55";
        //按照一个或者多个空白字符拆分
        String []ste = str.split("\\s+");
        System.out.println(Arrays.toString(ste));
    }

}
