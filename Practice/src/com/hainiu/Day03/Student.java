package com.hainiu.Day03;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-29 22:03
 */
public class Student {
    //定义成员变量，类之内，方法之外
    String name;
    int age;

    //行为：学习
    //成员方法: 跟之前定义方法的格式一样, 只不过去掉了static关键字.
    public void study(){

        System.out.println("学习");
    }

    public void eat(){

        for (int i = 0; i < 6; i++) {
            System.out.println(i);

        }
    }





}
