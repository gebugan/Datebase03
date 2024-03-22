package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-11 20:56
 */
public class ConProTest {
    public static String table = " ";
    public static int s = 1;
    public static int a = 1000;
    public static void main(String[] args) {
        Object lock = new Object();

        ConsumerThread ct = new ConsumerThread(lock);
        ConsumerThread ct2 = new ConsumerThread(lock);
        ProducerThread pt = new ProducerThread(lock);
        ProducerThread pt2 = new ProducerThread(lock);

        Thread t1 = new Thread(ct);
        Thread t2 = new Thread(ct2);
        Thread t3 = new Thread(pt);
        Thread t4 = new Thread(pt2);
        t1.setName("消费者1");
        t2.setName("消费者2");
        t3.setName("厨师1");
        t4.setName("厨师2");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
