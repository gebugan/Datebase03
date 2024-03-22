package hainiu.thread6;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 20:27
 */
public class ProducerThread implements Runnable{
    private Object lock;

    public ProducerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        //不断生产
        while (true){
            synchronized (lock){
                //判断有没有汉堡
                if (!"".equals(Test.table)){
                    //有，等待
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //没有，生产
                    Test.table = "汉堡包";
                    System.out.println(Thread.currentThread().getName() + "生产了一个" + Test.table);

                    //唤醒消费线程
                    lock.notifyAll();
                }
            }
        }
        
        

    }
}
