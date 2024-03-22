package com.hainiu.review;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-03-31 22:17
 */
public class MediatorDemo {
    public static void main(String[] args) {
        User zhang = new User("张三");
        User li = new User("李四");

        zhang.sendMessage("Hi! 李四!");
        li.sendMessage("Hello! 张三!");
    }
}
