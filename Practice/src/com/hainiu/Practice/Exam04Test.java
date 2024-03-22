package com.hainiu.Practice;

import java.util.LinkedList;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-12 16:19
 */
public class Exam04Test {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");

        //枷锁
        Object lock = new Object();

        Exam04 a1 = new Exam04(lock);
        Exam04 a2 = new Exam04(lock);
        Exam04 a3 = new Exam04(lock);


        //创建线程
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        Thread t3 = new Thread(a3);
        //命名
        t1.setName("线程A");
        t2.setName("线程B");
        t3.setName("线程C");
        //启动
        t1.start();
        t2.start();
        t3.start();


    }
}
