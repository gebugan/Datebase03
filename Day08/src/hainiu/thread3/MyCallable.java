package hainiu.thread3;

import java.util.concurrent.Callable;

/**
 * @program: Text
 * @description:实现callable接口 泛型就是线程执行完毕的
 * @author: 小戈
 * @create: 2023-04-06 09:44
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //求1-100的和
        Integer sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println("正在累加"+ i);

        }

        return sum;
    }



















































}
