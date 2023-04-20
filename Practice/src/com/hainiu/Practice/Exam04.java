package com.hainiu.Practice;


import java.util.LinkedList;

/**
 * @program: Text
 * @description:
 * 请编写程序，开启3条线程，每条线程的任务都是从集合中取出（需要从集合中移除）第一张英雄卡片
 * 每次取卡需要耗时0.1秒，直到取完为止。
 * 要求程序可以正常执行，并且在多次执行的过程中不会出现异常情况。效果如下：
 * 线程B获得英雄：及时雨宋江
 * 线程B获得英雄：玉麒麟卢俊义
 * 线程B获得英雄：智多星吴用
 * 线程B获得英雄：入云龙公孙胜
 * 线程B获得英雄：大刀关胜
 * 线程B获得英雄：豹子头林冲
 * 线程B获得英雄：霹雳火秦明
 * 线程C获得英雄：双鞭呼延灼
 * 线程C获得英雄：小李广花荣
 * 线程C获得英雄：小旋风柴进
 * 线程C获得英雄：扑天雕李应
 * 线程C获得英雄：美髯公朱仝
 * 线程A获得英雄：花和尚鲁智深
 * 线程A获得英雄：行者武松
 * @author: 小戈
 * @create: 2023-04-12 16:15
 */
public class Exam04 implements Runnable{

    private Object lock;
    public Exam04(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        //循环
        while (true){
            //同步
            synchronized (lock){
                LinkedList<Exam04Test> list = new LinkedList<>();
                //移除第一个
                list.removeFirst();
                //睡眠
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //输出
                System.out.println(Thread.currentThread().getName() + "获取英雄：" +list.getFirst());


            }
        }

    }
}
