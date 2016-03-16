package cz.sparko.testproject;

import java.util.UUID;

public class Guid {
    public static void main(String[] args) {
        String guid = UUID.randomUUID().toString();
        System.out.println(guid);
        UUID uuid = UUID.fromString(guid);
        System.out.println(uuid.toString());
    }
}
