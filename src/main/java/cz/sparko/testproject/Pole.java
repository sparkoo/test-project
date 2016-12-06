package cz.sparko.testproject;

import java.util.Arrays;

public class Pole {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        char[] arr2 = Arrays.copyOf(arr1, 5);
        arr2[arr2.length-1] = 0x2026;
        System.out.println(Arrays.toString(arr2));
//        System.out.println("asf " + null);
    }
}
