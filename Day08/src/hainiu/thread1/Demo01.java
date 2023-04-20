package hainiu.thread1;

/**
 * @program: Text
 * @description:main方法是在主线程中执行的，又在主线程上又出开启了两条线程
 * @author: 小戈
 * @create: 2023-04-06 09:07
 */
public class Demo01 {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        //开启线程  不用t.run();
        t.start();//申请系统资源开启一条线程，并自动调用run方法

        //再开一条
        MyThread t2 = new MyThread();
        t2.start();
        //效果两条线程互抢资源执行
    }

























}
