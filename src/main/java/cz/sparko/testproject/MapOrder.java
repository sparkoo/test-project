package cz.sparko.testproject;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapOrder {
    static final int HASH_BITS = 0x7fffffff; // usable bits of normal node hash
    public static void main(String[] args) {
        Map<String, String> testMap = new ConcurrentHashMap<>();
        testMap.put("1000000000000001", "sss");
        System.out.println(testMap.keySet());
        testMap.put("kacerovvvvv", "sss");
        System.out.println(testMap.keySet());
        testMap.put("kacerovvvvv1234", "sss");
        System.out.println(testMap.keySet());

        for (String key : testMap.keySet()) {
            int hash = spread(key.hashCode());
            System.out.println(hash);
        }
    }

    static int spread(int h) {
        return (h ^ (h >>> 16)) & HASH_BITS;
    }
}
