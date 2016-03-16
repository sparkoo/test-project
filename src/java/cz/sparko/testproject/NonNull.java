package cz.sparko.testproject;

import java.util.Objects;

public class NonNull {
    public static void main(String[] args) {
        Object prdel = null;
        Objects.requireNonNull(prdel, "prdel");
    }
}
