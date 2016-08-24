package ekkel.concurrency.ExceptionHandler;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Маша on 24.08.2016.
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler
{
    @Override
    public void uncaughtException(Thread t, Throwable e)
    {
        System.out.println("caught "+e);
    }
}
