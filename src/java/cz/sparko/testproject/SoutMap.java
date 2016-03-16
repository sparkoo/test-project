package cz.sparko.testproject;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SoutMap {
    public static void main(String[] args) {
        Map<String, Long> lastIds = new HashMap<String, Long>() {{ put("k1", 123L); }};
        lastIds.put("key1", 123L);
        lastIds.put("key2", 12345L);
        System.out.println(lastIds);
        Stream.of(lastIds).forEach(System.out::println);
    }
}
