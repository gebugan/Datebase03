package com.hainiu.oop1;

import javax.naming.Name;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 09:49
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建对象使用
        Student stu = new Student();//new关键字后面就是在调用构造方法
        System.out.println(stu);

        //使用属性：给属性赋值   获取属性的值
        stu.name = "TOM";
        stu.age = 20;

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.eat();
        stu.study();

    }


























}
