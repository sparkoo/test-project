package cz.sparko.testproject;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OOM {
    private static List<ByteBuffer> l = new ArrayList<>();

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 2_000; i++) {
            while (true) {
//                try {
                    l.add(ByteBuffer.allocate(10_000_000));
                    //                        someList.add(generateString(1_000_000, r));
//                } catch (Throwable e) {
//                    System.out.println(e);
//                    e.printStackTrace();
//                    break;
//                }
            }

        }
    }

    private static String generateString(int size, Random r) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(Character.valueOf((char) r.nextInt(255)));
        }
        return sb.toString();
    }
}
