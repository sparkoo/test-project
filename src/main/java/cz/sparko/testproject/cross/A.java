package cz.sparko.testproject.cross;

import cz.sparko.testproject.cross.next.B;

public class A {
    public static void main(String[] args) {
        new B().neco();
    }
    public void neco() {
        System.out.println("A");
    }
}
