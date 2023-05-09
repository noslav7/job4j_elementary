package ru.job4j.array;

import java.util.StringJoiner;

public class Task71 {
    public static void array(int[] arr) {
        StringJoiner stringJoinerFirst = new StringJoiner(" ");
        StringJoiner stringJoinerSecond = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                stringJoinerFirst.add(String.valueOf(arr[i]));
            } else {
                stringJoinerSecond.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(stringJoinerFirst);
        System.out.println(stringJoinerSecond);
    }
}
