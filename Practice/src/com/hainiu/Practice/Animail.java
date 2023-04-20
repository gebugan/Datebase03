package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-05 19:38
 */
public class Animail {
    private String name;

    public void fly(){
        System.out.println("这是父类的飞");
    }

    public Animail() {
        System.out.println("父类空参构造被调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animail(String name) {
        this.name = name;
    }
}
