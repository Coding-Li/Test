package cn.lijunhaoit.utils;

import java.util.concurrent.*;

/**
 * JAVA现成池工具
 * @author lijun
 */
public class ExecutorsUtils {

    /**
     * newFixedThreadPool
     */
    ExecutorService fixedThreadPool = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());



    /**
     * newWorkStealingPool
     */
    ExecutorService workStealingPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors(), ForkJoinPool.defaultForkJoinWorkerThreadFactory,null, true);

    public void get(){
        fixedThreadPool.execute(() ->{
            System.out.println();
        });
    }

}
