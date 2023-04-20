package com.hainiu.api4;

import java.math.BigDecimal;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-01 15:08
 */
public class Demo02 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.1");
        System.out.println(a);

        //实现小数的精确运算
        BigDecimal b = new BigDecimal(0.8);

        //加法
        BigDecimal c = a.add(b);
        double v = c.doubleValue();
        System.out.println(v);

    }




































}
