package cz.sparko.testproject;

public class EnumParse {
    public static void main(String[] args) {
        try {
            SomeEnum.valueOf("something");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    enum SomeEnum {
        VALUE1, VALUE2
    }
}
