package cz.sparko.testproject;

import java.util.function.IntFunction;

public class ReturnLambda {
    public static IntFunction<Byte> access(byte[] array) {
        return idx -> idx < array.length ? array[idx] : null;
    }
}
