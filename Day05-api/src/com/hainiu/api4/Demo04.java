package com.hainiu.api4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: Text
 * @description:Date用法
 * @author: 小戈
 * @create: 2023-04-01 15:49
 */
public class Demo04 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        //Sat Apr 01 15:50:27 CST 2023
        System.out.println(date);

        //格式化成字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM-dd:mm:ss");
        //format  2023-04-01:57:17
        String s = sdf.format(date);
        System.out.println(s);

        //把字符解析成日期对象
        String str = "2023-04-01:57:17";
        //simpleDateFormat
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd:mm:ss");
        Date date2 = sdf2.parse(str);
        System.out.println(date2);





    }





























}
