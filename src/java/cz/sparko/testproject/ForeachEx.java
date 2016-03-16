package cz.sparko.testproject;

import java.util.ArrayList;
import java.util.List;

public class ForeachEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("balbalbla");
        list.add("4");

        try {
            list.stream().forEach(i -> System.out.println(Integer.parseInt(i)));
        }catch (NumberFormatException nfe) {
            System.out.println("error");
        }
    }
}
