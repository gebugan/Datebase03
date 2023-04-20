package hainiu.thread7;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 20:31
 */
public class Test {
    //public static String table = " ";

        public static void main(String[] args) {

            //阻塞
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
            //lambe表达式
            new Thread(() -> {
                while (true){
                    //抓异常，赋值
                    try {
                        queue.put("汉堡包");
                        System.out.println(Thread.currentThread().getName() + "生产了一个汉堡包，目前剩余"
                                + queue.size() + "个");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                //运行
            }).start();
            new Thread(() -> {
                while (true){
                    try {

                        String s =  queue.take();
                        System.out.println(Thread.currentThread().getName() + "吃了一个汉堡包目前剩余"
                                + queue.size() + "个");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();


        }
        






}
