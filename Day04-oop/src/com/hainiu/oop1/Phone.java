package com.hainiu.oop1;

/**
 * @program: Text
 * @description: 描述手机对象的信息 javaBean类 一个简单的事务描述类
 * @author: 小戈
 * @create: 2023-03-31 09:56
 */
public class Phone {
    //属性
    String brand;
    private double price;
    //private 私有的

    ///行为

    public  void call (String name){
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage(){
        System.out.println(666666);
    }

    //提供方法来实现对成员变量的访问
    //给属性赋值 获得属性的值

    public void setPrice(double price){
        System.out.println(price);
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }






















}
