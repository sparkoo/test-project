package cz.sparko.testproject;

class Static {
    Static() {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    static {
        System.out.println("3");
    }

    void method() {
        System.out.println("4");
    }
}

class StaticApp {
    public static void main(String[] args) {
        System.out.println("5");
        new Static().method();
        new Static().method();
        System.out.println("6");
    }
}
