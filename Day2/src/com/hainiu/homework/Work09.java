package com.hainiu.homework;

/**
 * @program: Text
 * @description:1 2 3 4 四个数据，从中选择3个数字 组成一个三位数，要求选择的数字不重复。这样的三位数有多少个？
 *     三层循环
 * @author: 小戈
 * @create: 2023-03-28 19:36
 * 1.第一次选择外循环可选数据1234，中循环剔除外循环数字，可选3个数字
 * 2.内循环可选数子为两个
 */
public class Work09 {
    public static void main(String[] args) {
        int count = 0;
        int b = 0;
        int c = 0;
        for (int i = 1; i < 5 ; i++) {
            for (int j = 1; j < 5; j++) {
                if (j == i){
                    continue;
                }else {
                    b = j;
                }
                for (int k = 1; k < 5; k++) {
                    if (k == i){
                        continue;
                    }else if(k == j){
                        continue;
                    }else {
                        c = k;
                    }
                    count++;
                    System.out.print(100*i + 10*b + c +"\t");

                }

            }
        }
        System.out.println("\n这样的三位数有：" + count + "个");

    }
}
