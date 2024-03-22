package hainiu.thread6;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 20:31
 */
public class Test {
    public static String table = " ";

    public static void main(String[] args) {


        // 创建两条现场启动  为了保证同一把锁 把锁对象传给两条线程
        // 测试类中传递一个信号  字符串 有值就该消费  没值就该生产

        Object lock = new Object();
//
//        ProducerThread producerThread = new ProducerThread(lock);
//        ConsumerThread consumerThread = new ConsumerThread(lock);
//        Thread thread01 = new Thread(producerThread);
//        Thread thread02 = new Thread(consumerThread);
//        thread01.setName("Tom");
//        thread02.setName("jary");
//        thread01.start();
//        thread02.start();

        new Thread(new ProducerThread(lock),"Tom").start();
        new Thread(new ConsumerThread(lock),"Jary").start();


    }




}
