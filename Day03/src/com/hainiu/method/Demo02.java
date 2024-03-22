package com.hainiu.method;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-30 15:06
 *返回值 没有
 * 参数列表没有
 */
public class Demo02 {
    public static void main(String[] args) {
        print99();
    }
    public static void print99(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + "*" + i + "=" + j*i + "\t");

            }
            System.out.println();

        }
    }

}

