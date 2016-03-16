package cz.sparko.testproject;

import java.util.Timer;
import java.util.TimerTask;

public class Timers {
    public static void main(String[] args) throws InterruptedException {
        Timer t1 = new Timer();
        t1.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("t1");
            }
        }, 0, 500);
        Thread.sleep(2000);
        t1.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("t1-2");
            }
        }, 0, 200);

    }
}
