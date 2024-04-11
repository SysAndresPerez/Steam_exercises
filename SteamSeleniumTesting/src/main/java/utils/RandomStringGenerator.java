package utils;

import java.util.UUID;

public class RandomStringGenerator {

    private static final String myRandomName = randomString();

    public static String randomString() {
        return UUID.randomUUID().toString().toUpperCase().replace("-", "").substring(0, 9);
    }

    public static String getMyRandomName() {
        return myRandomName;
    }
}