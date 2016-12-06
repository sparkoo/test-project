package cz.sparko.testproject;

import java.util.stream.IntStream;

public class StreamPeek {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .filter(x -> x > 5)
                .peek(x -> System.out.println("peeg1 -> " + x))
                .map(x -> x + 2)
                .peek(x -> System.out.println("peeg2 -> " + x))
                .forEach(System.out::println);
        //        IntStream.range(1, 10).map(x -> 2);
        //        IntStream.range(1, 10).forEach(i -> i + 2);
    }
}
