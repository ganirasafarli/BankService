package com.company.util;

import java.util.Random;

public class UserUtil {
    Random random = new Random();

    public String cifGenerator() {
        int maximum = 9999999;
        int minimum = 1000000;
        return String.valueOf(random.nextInt(maximum - minimum + 1) + minimum);
    }
}
