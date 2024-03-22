package hainiu.thread4;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 11:33
 */
public class       MyTicket  implements Runnable{
    private int ticket = 1000;
    @Override
    public void run() {

        while (true){


            synchronized (MyTicket.class) {
                if (ticket <= 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖出第" + ticket +"张票");
                ticket--;
            }
        }

    }




















}
