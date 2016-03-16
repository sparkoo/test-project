package cz.sparko.testproject;

public class Volatile {
    public static void main(String[] args) {
        VTest v = new VTest();
        v.goVolatile();
        v.goNonVolatile();
    }

    private static class VTest {
        private volatile long testVolatileLong = 0;
        private long testNonVolatileLong = 0;

        public void goVolatile() {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                testVolatileLong ++;
            }
            System.out.println(testVolatileLong + " increments volatile: " + (System.currentTimeMillis() - startTime) + "ms");
        }

        public void goNonVolatile() {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                testNonVolatileLong ++;
            }
            System.out.println(testNonVolatileLong + " increments non volatile: " + (System.currentTimeMillis() - startTime) + "ms");
        }
    }
}
