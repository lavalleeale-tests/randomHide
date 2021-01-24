package com.axlav;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class randomHide {
        public static String[] hideString(long seed, String toHide) {
        Random rng = new Random(seed);
        char[] toHideChars = toHide.toCharArray();
        char[] hidden = RandomStringUtils.randomPrint(toHide.length()*100).toCharArray();
        for (char toHideChar : toHideChars) {
            hidden[rng.nextInt(hidden.length)] = toHideChar;
        }
        hidden[rng.nextInt(hidden.length)] = '\1';
        return new String[]{""+seed, new String(hidden)};
    }
}
