package cz.sparko.testproject;

public class T {
    private final int[] array;

    public T(int size) {
        array = new int[size];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public void print() {
        for (int i : array)
            System.out.println(i);
    }

    @Override
    public String toString() {
        return "tak urcite";
    }
}
