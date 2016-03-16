package cz.sparko.testproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    static int N = 50000000;
    static List<String> strings = new ArrayList<>();
    static String concat = "concat this piece of strfsafasing";
    public static void main(String[] args) {
        Arrays.asList(null);
//        for (String s : "JobsService.PrintJob".split("\\.")) {
//            System.out.println(s);
//        }
//        Collection<String> s = new ArrayList<>();
//        s.add("ddd");
//        s.add("qwpeoj");
//        System.out.println(s);
//        List<String> fff = new ArrayList<>();
//        fff.add("gg");
//        fff.add(null);
//        fff.add("f");
//        for (String s : fff) {
//            System.out.println(s);
//        }
//        hash(1);
//        hash(2);
//        hash(3);
//        for (int i = 0; i < N; i++) {
//            strings.add(concat);
//        }
//        String[] sss = {"jedna", "dva", "tri"};
//        List<String> sl = Arrays.asList(sss);
//        for (String s : sl) {
//            System.out.println(s);
//        }
//        sss[2] = "jojo";
//        for (String s : sl) {
//            System.out.println(s);
//        }
//        sl.set(1, "nene");
//        for (String s : sl) {
//            System.out.println(s);
//        }


//        arrays();

//        long startTime = System.currentTimeMillis();
//        String s = String.join("", strings);
//        System.out.println(s.length());
//        System.out.println("joiner: " + (System.currentTimeMillis() - startTime));
//
//        startTime = System.currentTimeMillis();
//        StringBuilder builder = new StringBuilder();
//        strings.forEach((ss) -> builder.append(ss));
////        for (String ss : strings) {
////            builder.append(ss);
////        }
//        String sB = new String(builder);
//        System.out.println(sB.length());
//        System.out.println("builder: " + (System.currentTimeMillis() - startTime));
    }

    private static void hash(Object o) {
        System.out.println(Objects.hash(o));
    }

    private static void arrays() {
        long startTime = System.currentTimeMillis();
        String[] s = toList1(strings);
        System.out.println(s.length);
        System.out.println("list.toArray(new String[list.size()]): " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        s = toList2(strings);
        System.out.println(s.length);
        System.out.println("list.toArray(new String[0]): " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        List<String> sList = toList3(strings);
        System.out.println(sList.size());
        System.out.println("new ArrayList(list): " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
//        sList = toList4(strings);
        System.out.println(sList.size());
        System.out.println("new LinkedList(list): " + (System.currentTimeMillis() - startTime));
    }

    private static String[] toList1(List<String> list) {
        return list.toArray(new String[list.size()]);
    }

    private static String[] toList2(List<String> list) {
        return list.toArray(new String[0]);
    }

    private static List<String> toList3(List<String> list) {
        return new ArrayList(list);
    }

    private static List<String> toList4(List<String> list) {
        return new LinkedList(list);
    }

    private static void join() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(concat);
        }
        long startTime = System.currentTimeMillis();
        String s = String.join("", list);
        System.out.println(s.length());
        System.out.println("joiner: " + (System.currentTimeMillis() - startTime));
    }

    private static String buildStringBuilder(List<String> slist) {
        StringBuilder s = new StringBuilder();
        for (String ss : slist) {
            s.append(ss);
        }
        return s.toString();
    }

    private static void buildStringBuffer() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < N; i++) {
            s.append(concat);
        }
    }

    private static void buildStringPlus() {
        String s = "";
        for (int i = 0; i < N; i++) {
            s = s + concat;
        }
    }

    public static void someMethod(int... arr) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < N; i++) {
            s.append(concat);
        }
        long startTime = System.currentTimeMillis();
        String ss = s.toString();
        System.out.println(ss.length());
        System.out.println("jjj: " + (System.currentTimeMillis() - startTime));
    }

    static class A {

    }

    static class B extends A {

    }
}
