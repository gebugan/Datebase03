package com.hainiu.homework;

/**
 * @program: Text
 * @description: 子类，继承phone
 * @author: 小戈
 * @create: 2023-03-31 21:21
 */
public class DumbPhone extends Phone implements Help{

    //空的构造方法
    public DumbPhone(){

    }

    public DumbPhone(double price, String band) {
        super(price, band);
    }

    //重写父类的抽象方法
    @Override
    public void call(String name) {
        System.out.println("这是一台老年机" );
        System.out.println("给" + name + "打电话");

    }

    //重写接口的抽象方法
    @Override
    public void call() {
        System.out.println("一键呼救");

    }
}
