package cz.sparko.testproject.cross.next;

import cz.sparko.testproject.cross.A;

public class B {
    public void neco() {
        System.out.println("B");
        new A().neco();
    }
}
