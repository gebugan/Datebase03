package hainiu.thread5;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 11:33
 */
public class Demo {

    public static void main(String[] args) {


        MyTicket a = new MyTicket();

       new Thread(a,"售票口1").start();

       new Thread(a,"售票口2").start();


    }
    }

