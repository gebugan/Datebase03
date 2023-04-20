package com.hainiu.Day03;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-03 09:28
 */
public class Test02 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入英文字符和数字字符：");
        String text = sc.nextLine();

        a(text,a,b);

    }
    public static void a(String text,int a,int b){

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.print(c + "\t");
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                a++;
            }else if(c >= '0' && c <= '9'){
                b++;
            }
        }
        System.out.println();
        System.out.println("英文字符有" + a + "个");
        System.out.println("数字字符有" + b + "个");


    }



}
