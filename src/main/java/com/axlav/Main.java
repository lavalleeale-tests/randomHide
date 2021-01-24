package com.axlav;

import java.util.Random;

public class Main {
    public static void main(String[] Args) {
        long seed;
        String text;
        if (Args[0].equals("hide")) {
            try {
                seed=Long.parseLong(Args[1]);
                text = Args[2];
            } catch (NumberFormatException ignored) {
                Random rng = new Random();
                seed = rng.nextLong();
                text = Args[1];
            }
            String[] hidden = randomHide.hideString(seed, text);
            System.out.printf("Hidden: %s\nSeed: %s\n", hidden[1], hidden[0]);
        } else if (Args[0].equals("find")) {
            try {
                seed=Long.parseLong(Args[1]);
                text = Args[2];
            } catch (NumberFormatException ignored) {
                throw new NumberFormatException("Invalid Seed");
            }
            System.out.printf("Text: %s", randomFind.findString(seed, text));
        } else {
            throw new IllegalArgumentException("Must specify find or hide");
        }
    }
}
