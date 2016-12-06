package cz.sparko.testproject;

public class Diamond {
    public static void main(String[] args) {
        C c = new D();
        c.m();
    }
}


interface A {
    default void m() { System.out.println("hello from A"); }
}
interface B extends A {
    default void m() { System.out.println("hello from B"); }
}
interface C extends A {
}
class D implements B, C {}
