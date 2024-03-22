package com.hainiu.Practice;


/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-11 20:55
 */
public class ConsumerThread implements Runnable{

    private Object lock;

    public ConsumerThread(Object lock) {
        this.lock = lock;
    }

    //消费者消费汉堡
    @Override
    public void run() {
        //循环
        while (ConProTest.a  > 0){
            //同步锁
            synchronized (lock) {
                //判断是否有
                if ( ConProTest.s <= 0) {

                    //睡眠
                    try {
                        lock.wait();
                        //Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
                //吃汉堡
                ConProTest.table = " ";
                ConProTest.s --;
                System.out.println(Thread.currentThread().getName() + "消费了一个汉堡,汉堡数量还剩："
                        + ConProTest.s +"个");


                //唤醒厨师
                lock.notifyAll();

                ConProTest.a --;

            }


        }

    }


}
