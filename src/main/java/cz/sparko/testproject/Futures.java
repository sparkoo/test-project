package cz.sparko.testproject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Futures {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        System.out.println("1");
        Future<String> future = doSomething();
        System.out.println("2");
        System.out.println(future.get(500, TimeUnit.MILLISECONDS));
        System.out.println("3");
    }

    public static Future<String> doSomething() {
        return Executors.newSingleThreadExecutor().submit(() -> {
            System.out.println("11");
            Thread.sleep(1000L);
            System.out.println("22");
            return "S";
        });
    }
}
