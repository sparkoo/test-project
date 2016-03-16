package cz.sparko.testproject;

import java.util.Optional;

public class Opt {
    static String SOMETHING = null;
    static String SOMETHING_ELSE = "something else";
    public static void main(String[] args) {

        Optional<String> address = Optional.ofNullable(SOMETHING);
        System.out.println(address.map((p) -> p.charAt(1)).orElse(null));
//        System.out.println(address.isPresent() ? address.get() : doSomething());
//        System.out.println(Optional.ofNullable(SOMETHING).orElse(doSomething()));
    }

    private static String doSomething() {
        System.out.println("process");
        return SOMETHING_ELSE;
    }
}
