package ru.job4j.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            stringJoiner.add(String.valueOf(arr[i]));
        }
        System.out.println(stringJoiner);
    }
}
