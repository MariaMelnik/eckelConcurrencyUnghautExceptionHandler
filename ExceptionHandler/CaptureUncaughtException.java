package ekkel.concurrency.ExceptionHandler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Маша on 24.08.2016.
 */
public class CaptureUncaughtException
{
    public static void main(String[] args){
        ExecutorService executorService= Executors.newCachedThreadPool(new HandlerThreadFactory());
        executorService.execute(new ExceptionThread2());
    }
}
