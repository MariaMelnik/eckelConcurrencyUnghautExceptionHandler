package ekkel.concurrency.ExceptionHandler;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Маша on 24.08.2016.
 */
public class HandlerThreadFactory implements ThreadFactory
{
    @Override
    public Thread newThread(Runnable r)
    {
//        System.out.println("stack of HandlerThreadFactory");
//        StackTraceElement[] stack=Thread.currentThread().getStackTrace();
//        for(StackTraceElement e:stack){
//            System.out.println(e);
//        }
        System.out.println(this+" creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created "+t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("eh = "+t.getUncaughtExceptionHandler());
        return t;
    }
}
