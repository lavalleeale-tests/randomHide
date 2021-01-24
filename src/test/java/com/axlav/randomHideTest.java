package com.axlav;

import org.junit.jupiter.api.Test;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;


class randomHideTest {

    @Test
    void main() {
        Random rng = new Random();
        String testString = "This is a test";
        String[] hidden = randomHide.hideString(rng.nextLong(), testString);
        final long hiddenSeed = Long.parseLong(hidden[0]);
        final String hiddenText = hidden[1];
        assert testString.equals(randomFind.findString(hiddenSeed, hiddenText));
    }
}