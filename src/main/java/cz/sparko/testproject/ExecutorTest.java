package cz.sparko.testproject;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorTest {
    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        IntStream.range(1, 10).forEach((i) -> executor.execute(() -> {
            System.out.println("start long running task: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end long running task: " + i);
        }));
        System.out.println("ende");
    }
}
