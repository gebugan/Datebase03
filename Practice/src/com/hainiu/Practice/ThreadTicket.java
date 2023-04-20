package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-10 22:22
 */
public class ThreadTicket implements Runnable{
    private static int ticket = 1000;
    @Override
    public void run() {
        while (true) {
            //同步锁
            synchronized (ThreadTicket.class) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                if (ticket == 0) {
                    System.out.println("票已经买完");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "正在卖出第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
