package com.hainiu.dayTwo;

import java.util.Scanner;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-27 20:37
 */
public class tiger {
    public static void main(String[] args) {
        System.out.println("请输入老虎一的体重:");
        Scanner tiger01 = new Scanner(System.in);
        //数值型为int
        int tigerWeight01 = tiger01.nextInt();
        //System.out.println(tigerWeight01);

        System.out.println("请输入老虎二的体重:");
        Scanner tiger02 = new Scanner(System.in);
        int tigerWeight02 = tiger02.nextInt();


        boolean a = tigerWeight01 == tigerWeight02 ? true : false;
        System.out.println(a);
        if (a == true){
            System.out.println("两只老虎体重相同");
        }else{
            System.out.println("两只老虎体重不同");
        }
        
    }
    
}
