package hainiu.thread3;

import javafx.concurrent.Task;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 09:46
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable c = new MyCallable();


        //这个类实现了runnable接口，可作为Thread参数
        //线程执行完毕FutureTask可以获得线程执行的结果
        FutureTask<Integer> tesk = new FutureTask<>(c);
        //
        Thread t1 = new Thread(tesk);
        t1.start();


        //线程执行完毕FutureTask可以获得线程执行的结果
        FutureTask<Integer> tesk2 = new FutureTask<>(c);
        //
        Thread t2 = new Thread(tesk2);
        t2.start();

        //等待线程结束，获取结果
        Integer  result = tesk.get();//阻塞式，线程运行完毕返回主线程，继续运行



        //等待线程结束，获取结果
        Integer  result2 = tesk.get();//阻塞式，线程运行完毕返回主线程，继续运行

        System.out.println(result);

        System.out.println(result2);



    }































}
