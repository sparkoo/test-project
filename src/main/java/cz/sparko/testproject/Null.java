package cz.sparko.testproject;

public class Null {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(String... args) {
        System.out.println("++++++");
        for (String s : args) {
            System.out.println(s);
        }
        System.out.println("......");
    }
}
