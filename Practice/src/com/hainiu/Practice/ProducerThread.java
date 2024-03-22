package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-11 20:56
 */
public class ProducerThread implements Runnable{
    private Object lock;

    public ProducerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (ConProTest.a > 0){
            synchronized (lock){
                if ( (0 <  ConProTest.s) && (ConProTest.s >= 3)) {

                    try {
                        lock.wait();
                        // Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                //生产汉堡

                ConProTest.table = "汉堡";
                ConProTest.s ++;
                System.out.println(Thread.currentThread().getName() +"生产了一个汉堡,汉堡还剩"
                            +  ConProTest.s+ "个");


                //唤醒消费者
                lock.notifyAll();

                ConProTest.a --;



            }
        }

    }
}
