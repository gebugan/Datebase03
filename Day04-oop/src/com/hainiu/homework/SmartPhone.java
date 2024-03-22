package com.hainiu.homework;

/**
 * @program: Text
 * @description: 子类，继承phone
 * @author: 小戈
 * @create: 2023-03-31 20:38
 * 抽象类的子类 ：要么重写抽象类中的所有抽象方法  要么是抽象类
 */
public  class SmartPhone extends Phone implements PlayGames{
    //手机大小
    private String size;

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void call(String name) {
        System.out.println("我是SmartPhone中的call方法 :" + name);
    }
    /**
     * 对接口类进行重写
     */
    @Override
    public void play() {
        System.out.println("SmartPhone 能玩游戏");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
