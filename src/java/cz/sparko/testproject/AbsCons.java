package cz.sparko.testproject;

public class AbsCons {
    public static void main(String[] args) {
        new Child();
    }
}

abstract class Abs {
    public Abs(int k) {
        System.out.println("abs constructor" + k);
    }
}

abstract class AbsChild extends Abs {
    public AbsChild() {
        super(1);
        System.out.println("abstract child constructor");
    }
}

class Child extends AbsChild {
    public Child() {
        System.out.println("child child construcotor");
    }
}