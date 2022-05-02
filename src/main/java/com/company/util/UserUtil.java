package com.company.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class UserUtil {
    static Random random = new Random();

    public static String cifGenerator() {
        int maximum = 9999999;
        int minimum = 1000000;
        return String.valueOf(random.nextInt(maximum - minimum + 1) + minimum);
    }

}
