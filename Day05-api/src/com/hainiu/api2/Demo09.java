package com.hainiu.api2;

import java.util.Random;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-01 11:49
 */
public class Demo09 {
    //生成验证码
    public static void main(String[] args) {

        //生成四位的字符串 大写字母小写字母字母数字
        //通过索引操作数据

        //将所有可用字符存储起来 String
        String str = "";
        for (char i = 'a'; i <= 'z' ; i++) {
            str += i;
        }
        for (char i = 'A'; i <= 'Z' ; i++) {
            str += i;
        }
        for (char i = '0'; i <= '9' ; i++) {
            str += i;
        }
        System.out.println(str);
        //循环四次每次随机获取一个索引 通过索引获取元素

        String code = "";

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(str.length());
            char c = str.charAt(index);

            code += c;
        }
        System.out.println(code);

    }




























































}
