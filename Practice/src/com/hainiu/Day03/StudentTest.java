package com.hainiu.Day03;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-29 22:12
 */
public class StudentTest {
    /**
        创建对象的格式:
                类名 对象名 = new 类名();
        调用成员变量的格式:
                对象名.变量名
        调用成员方法的格式:
                对象名.方法名();
     */
    public static void main(String[] args) {

        Student stu = new Student();

//        System.out.println(stu.age);
//        System.out.println(stu.name);

        stu.study();

        stu.name = "张三";
        stu.age = 18;

        System.out.println(stu.age);
        System.out.println(stu.name);

        stu.eat();
    }
}
