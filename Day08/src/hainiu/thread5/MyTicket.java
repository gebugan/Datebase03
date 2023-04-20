package hainiu.thread5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 11:33
 */
public class MyTicket  implements Runnable{
    private int ticket = 1000;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {

        while (true){


           lock.lock();
           try {
               if (ticket <= 0){
                   break;
               }
//               try {
//                   Thread.sleep(10);
//               } catch (InterruptedException e) {
//                   e.printStackTrace();
//               }
               System.out.println(Thread.currentThread().getName() + "正在卖出第" + ticket +"张票");
               ticket--;


           }finally {

               lock.unlock();
           }



        }

    }




















}
