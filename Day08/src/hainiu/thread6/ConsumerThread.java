package hainiu.thread6;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 20:35
 */
public class ConsumerThread implements Runnable{
    private Object lock;

    public ConsumerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                //判断汉堡
                if ("".equals(Test.table)){
                    //等待汉堡
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //吃汉堡
                Test.table = "";
                System.out.println(Thread.currentThread().getName() + "消费了一个"+Test.table);

                //唤醒厨师
                lock.notifyAll();
            }
        }

    }
}
