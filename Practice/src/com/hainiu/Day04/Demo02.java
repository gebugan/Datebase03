package com.hainiu.Day04;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 08:50
 */
public class Demo02 {
    //成员变量
    String name;
    private int age;

    //提供get/set方法
    public void setAge(int a) {
        if(a<0 || a>120) {
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}


