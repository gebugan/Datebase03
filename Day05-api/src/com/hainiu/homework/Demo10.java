package com.hainiu.homework;

import java.math.BigDecimal;

/**
 * @program: Text
 * @description:利用BigDecimal完成小数的精确运算
 * @author: 小戈
 * @create: 2023-04-02 14:54
 */
public class Demo10 {
    public static void main(String[] args) {
        //将字符串类型的数字转换为BigDecimal对象
       BigDecimal a = new BigDecimal(0.1);
       BigDecimal b = new BigDecimal(0.8);
       //进行加法
       BigDecimal c = a.add(b);
       //转成double型数据
       double d = c.doubleValue();
        System.out.println(d);

    }
}

