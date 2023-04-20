package com.hainiu.Day04;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 09:01
 */
public class Demo05 {

    private String name;
    private int age;

    // 1. 如果一个类中没有编写任何构造方法, 系统将会提供一个默认的无参数构造方法
    public Demo05(){}

    // 2. 如果手动编写了构造方法, 系统就不会再提供默认的无参数构造方法了
    public Demo05(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("我是Student类的构造方法");
    }

    public void show(){
        System.out.println(name + "..." + age);
    }
}
