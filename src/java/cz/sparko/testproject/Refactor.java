package cz.sparko.testproject;

public class Refactor {
    public static void main(String[] args) {
        Am a = new Am();
        a.doSomething();
    }
}

class Am {
    private int alpha = 0;

    private int getValue() {
        alpha++;
        return 12;
    }

    public void doSomething() {
        int v = getValue();
        int total = 0;
        for (int n = 0; n < 10; n++) {
            total += getValue();
        }
        System.out.println(total);
    }
}

/*
public class A  {
    private int alpha = 0;
    private int getValue() {
        alpha++;
        return 12;
    }
    public void doSomething() {
       int total = 0;
       for (int n = 0; n < 10; n++) {
           total += getValue();
       }
    }
    }
 */