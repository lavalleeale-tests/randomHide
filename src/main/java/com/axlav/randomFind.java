package com.axlav;

import java.util.ArrayList;
import java.util.Random;

public class randomFind {
    public static String findString(long seed, String hidden) {
        char[] hiddenChars = hidden.toCharArray();
        Random rng = new Random(seed);
        char cur = '\0';
        ArrayList<Character> output = new ArrayList<>();
        while (cur!='\1') {
            output.add(cur);
            cur = hiddenChars[rng.nextInt(hiddenChars.length)];
        }
        output.remove((Object)'\0');
        return getStringRepresentation(output);
    }
    private static String getStringRepresentation(ArrayList<Character> list)
    {
        StringBuilder builder = new StringBuilder(list.size());
        for(Character ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }
}
