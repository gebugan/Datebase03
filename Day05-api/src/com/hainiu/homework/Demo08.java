package com.hainiu.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: Text
 * @description:完成Date对象和字符串的互换
 *     SimpleDateFormat
 * @author: 小戈
 * @create: 2023-04-02 12:43
 */
public class Demo08 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        //使用SimpleDateFormat类，更改日期显示格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        //调用SimpleDateFormat中的format方法，传入日期进行更改
        String sdfDate = sdf.format(date);
        //输出更改后的日期
        System.out.println(sdfDate);

        //将字符串解析为日期对象
        String str = "1999-10-10-11:11:11";
        //使用SimpleDateFormat类，更改日期显示格式
        SimpleDateFormat sdf01= new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        //新建对象date02，并将sdf01中的parse方法调用，并且传入字符串str
        Date date02 = sdf01.parse(str);
        System.out.println(date02);




    }
}
