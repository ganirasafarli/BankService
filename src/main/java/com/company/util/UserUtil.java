package com.company.util;

import java.util.Random;

public class UserUtil {
    private final static Random random = new Random();

    public static String cifGenerator() {
        int maximumValue = 9999999;
        int minimumValue = 1000000;
        return String.valueOf(random.nextInt(maximumValue - minimumValue + 1) + minimumValue);
    }
}
