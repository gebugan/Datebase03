package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-09 18:55
 */
public abstract class Father {
    private int age = 20;
    private String name = "张三";

    public static void jing(){
        System.out.println("这是父类的一个静态方法");
    }
    public void ceshi(){
        System.out.println("这是父类的公共方法");
    }
    public abstract void dad();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Father(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Father() {
    }
}
