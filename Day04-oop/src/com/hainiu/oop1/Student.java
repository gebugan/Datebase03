package com.hainiu.oop1;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 09:46
 */
//该类用于描述学生信息
public class Student {
    //属性 成员变量
    String name;
    int age;

    //行为 成员方法
    public void study(){
        System.out.println(name + "正在学习");
    }

    public void eat(){
        System.out.println("正在干饭");
    }

    //构造方法
    //如果没有给出任何的构造方法，那么系统就会给出一个无参数的构造方法，那么默认构造就不存在了
    //给对象进行初始化的

    public Student(){
        System.out.println("构造方法执行了");
    }
    public Student(String name,int age){
        this.age = age;
        this.name = name;
    }























}
