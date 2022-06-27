package ru.job4j.algo;

import java.util.ArrayList;
import java.util.List;

public class UpperCase {
    public static char[] onlyLowCase(char[] input) {
        List<Character> preList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (Character.isLowerCase(input[i])) {
                char upper = Character.toUpperCase(input[i]);
                preList.add(upper);
            }
        }
        char[] result = new char[preList.size()];
        for (int i = 0; i < preList.size(); i++) {
            result[i] = preList.get(i);
        }
        return result;
    }
}
