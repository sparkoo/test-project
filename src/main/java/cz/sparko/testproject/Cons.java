package cz.sparko.testproject;

public class Cons {
    public static void main(String[] args) {
        new X("aaa");
    }
}

class S {
    public S(String a) {
        System.out.println(a);
    }
}

class X extends S {
    public X(String sss) {
        super("ssssss");
        System.out.print(sss);
    }
}
