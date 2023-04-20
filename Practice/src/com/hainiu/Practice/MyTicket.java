package com.hainiu.Practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-10 22:21
 */
public class MyTicket {


    public static void main(String[] args) {
        ThreadTicket test1  = new ThreadTicket();


        Thread t1 = new Thread(test1,"售票口1");
        Thread t2 = new Thread(test1,"售票口2");

        t1.start();
        t2.start();
    }







 }
