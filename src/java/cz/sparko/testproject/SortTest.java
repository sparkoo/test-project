package cz.sparko.testproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        int T = 100;
        List<Long> times = new ArrayList<>();
        for (int tries = 0; tries < T; tries ++) {
            long startMillis = System.currentTimeMillis();
            List<Integer> testcollection = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 1_000_000; i++) {
                testcollection.add(r.nextInt());
            }
            testcollection.sort((o1, o2) -> o1 > o2 ? 1 : o2 > o1 ? -1 : 0);
            times.add(System.currentTimeMillis() - startMillis);
        }
        long sum = 0;
        for (Long time : times) {
            sum += time;
        }
        double avg = sum / T;
        System.out.println(avg + "ms");
    }
}
