package cz.sparko.testproject;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPrint {
    public static void main(String[] args) {
        Map<String, String> m = new LinkedHashMap<>();

        m.put("jedna", "j");
        m.put("a", "f");

        System.out.println(m);
    }
}
