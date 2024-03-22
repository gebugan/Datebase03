package com.hainiu.Day04;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 08:56
 */
public class Demo03 {
    private String name;
    private int age;

    //构造方法,
    // 创建对象的时候调用，每创建一次对象，就会执行一次构造方法
    public Demo03() {
        System.out.println("无参构造方法");
    }

    public void show() {
        System.out.println(name + "," + age);
    }

}
