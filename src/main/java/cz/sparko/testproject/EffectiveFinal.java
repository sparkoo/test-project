package cz.sparko.testproject;


import java.util.Arrays;
import java.util.List;

public class EffectiveFinal {
    public static void main(String[] args) {
        List<Integer> stringsList = Arrays.asList(1, 2, 3, 4, 5);
        int i = 7;
        stringsList.forEach((s) -> System.out.println(s + i));
    }
}
