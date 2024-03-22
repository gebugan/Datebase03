package com.hainiu.homework;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 21:07
 */
public class Test {
    public static void main(String[] args) {
        SmartPhone smart = new SmartPhone();
        smart.open();
        smart.call("张三");
        smart.play();

        DumbPhone dumb = new DumbPhone();
        //调用DumbPhone中重写的call方法并赋值李四输出
        dumb.call("李四");



    }
}
