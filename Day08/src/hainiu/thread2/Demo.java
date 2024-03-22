package hainiu.thread2;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 09:31
 */
public class Demo {
    public static void main(String[] args) {
        //创建子类对象
        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r);
        t1.start();

        Thread t2 = new Thread(r);
        t2.start();

    }

























}
