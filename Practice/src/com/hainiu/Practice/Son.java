package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-09 18:55
 */
public class Son extends Father implements man{
    public int age = 60;

    @Override
    public void ceshi(){
        System.out.println("这是子类的公共方法");
    }


    @Override
    public void dad() {

    }

    @Override
    public void bit() {
        System.out.println("这是接口的方法");
    }
}
