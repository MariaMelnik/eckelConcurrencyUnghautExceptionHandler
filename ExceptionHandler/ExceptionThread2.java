package ekkel.concurrency.ExceptionHandler;

/**
 * Created by Маша on 24.08.2016.
 */
public class ExceptionThread2 implements Runnable
{
    @Override
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("run() by "+t);
        System.out.println("eh="+t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
