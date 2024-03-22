package hainiu.thread7;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-06 21:54
 */
public class Demo {
    /**
     * public ThreadPoolExecutor(int corePoolSize,						// 核心线程数量  3
     *                           int maximumPoolSize,					// 最大线程数量  5
     *                           long keepAliveTime,					// 空闲线程存活时间（值）
     *                           TimeUnit unit,						    // 空闲线程存活时间（单位）
     *                           BlockingQueue<Runnable> workQueue,	    // 阻塞队列
     *                           ThreadFactory threadFactory,			// 新线程的创建工厂（产生方式）
     *                           RejectedExecutionHandler handler)		// 拒绝策略
     *
     *                           拒绝策略：同时提交的任务数量超过 阻塞队列+最大线程数量，触发拒绝策略
     *                           ThreadPoolExecutor类的4个内部类
     *                              AbortPolicy 拒绝新任务 并且抛出异常（默认）
     *                              CallerRunsPolicy 绕过线程池 调用run方法
     *                              DiscardOldestPolicy 抛弃等待时间最久的任务
     *                              DiscardPolicy 静默的拒绝任务（不建议）
     */

    public static void main(String[] args) {
        //自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
                10,
                20,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 16; i++) {
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "执行");
            });

        }

    }
}
