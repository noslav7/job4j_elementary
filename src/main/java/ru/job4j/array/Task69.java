package ru.job4j.array;

import java.util.StringJoiner;

public class Task69 {
    public static void array(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            stringJoiner.add(String.valueOf(arr[i]));
        }
        System.out.println(stringJoiner);
    }
}
