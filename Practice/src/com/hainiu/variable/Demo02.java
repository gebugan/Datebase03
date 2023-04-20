package com.hainiu.variable;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-27 16:36
 */
public class Demo02 {
    public static void main(String[] args) {
        //8种基本数据类型，都定义一个变量，并输出一个他的值

        //整型，一个字节
        byte b1=-128;
        byte b2=127;
        System.out.println(b1);
        System.out.println(b2);

        //短整型，2个字节
        short s1 = 100;
        System.out.println(s1);
        

        //长整型，八个字节
        long l1 = 200000000000L;
        System.out.println(l1);

        //整型，4个字节
        int i1 = 3000;
        System.out.println(i1);
        
        //单精度浮点型4
        float ff1 = 33f;
        System.out.println(ff1);

        //双精度浮点型8
        double d1 = (float)3.555;
        System.out.println(d1);
        
        //字符型2
        char ch1 = 100;
        System.out.println(ch1);

        //布尔型1
        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
