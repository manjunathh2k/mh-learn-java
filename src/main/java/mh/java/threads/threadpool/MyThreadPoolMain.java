package mh.java.threads.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolMain implements Runnable{

    public static void main(String[] args) throws Exception{

        ExecutorService es = Executors.newFixedThreadPool(3);

        for(int i=0;i<3;i++)
        {
            System.out.println("Tread [" + i + "]" + " to be started ..");
            es.submit(new MyThreadPoolMain());
            Thread.sleep(1000);
            System.out.println("Tread [" + i + "]" + " started ..");
        }

        try{
            System.out.println("Before Calling ShutDown...");
            es.shutdown();
            es.awaitTermination(1000,TimeUnit.MINUTES);
            System.out.println("About to terminate ...");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Start of Run Thread - " + Thread.currentThread().getName());
        try {
            Thread.sleep(8000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("End of run for Thread - " + Thread.currentThread().getName());
    }
}
