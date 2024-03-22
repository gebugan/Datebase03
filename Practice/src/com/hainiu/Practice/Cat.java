package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-05 19:15
 */
public class Cat extends Animail implements Inter{
    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }
    public int s(){
        System.out.println(Inter.a);
        return Inter.a;
    }
    @Override
    public void fly(){
        System.out.println("这是子类的飞");
    }



}
