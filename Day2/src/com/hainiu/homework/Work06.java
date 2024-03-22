package com.hainiu.homework;

/**
 * @program: Text
 * @description:循环的嵌套 九九乘法表
 * @author: 小戈
 * @create: 2023-03-28 19:34
 * 1.利用循环生成数字1-9
 * 2.循环内部进行一个内循环，外部生成一个数内部生成小于外部数字
 * 3.进行输出计算，外循每循环一次换一次行，内循环输出不换行print
 */
public class Work06 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i + "*" + j + "=" + i*j  + "\t");
            }

            //换行。记
            System.out.print("\n");
        }

    }

}
