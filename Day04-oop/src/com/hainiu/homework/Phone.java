package com.hainiu.homework;

/**
 * @program: Text
 * @description:、抽象类接口案例
 * @author: 小戈
 * @create: 2023-03-31 20:34
 *手机类 定义各种类型手机的共同特征
 * 父类
 */
public abstract class Phone {
    private double price;
    private String band;


    //抽象方法定义  表示该父类为一个抽象类
    public abstract void call(String name);

    //公共方法，可直接被调用
    public void open() {
        System.out.println("我是phone，启动设备");
    }
    //空的构造方法
    public Phone() {
    }
    //全参的构造方法
    public Phone(double price, String band) {
        this.price = price;
        this.band = band;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", band='" + band + '\'' +
                '}';
    }
}
