package cn.lijunhaoit.demo.javabasic.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class TestThreadPoolExecutor {

    private static ExecutorService executor = new ThreadPoolExecutor(10,10,60L, TimeUnit.SECONDS,new ArrayBlockingQueue(10));



    public static void main(String[] args){
        //executor
        executor.shutdown();


    }

}
