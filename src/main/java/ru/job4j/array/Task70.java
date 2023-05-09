package ru.job4j.array;

import java.util.StringJoiner;

public class Task70 {
    public static void array(int[] arr) {
        StringJoiner stringJoinerFirst = new StringJoiner(" ");
        StringJoiner stringJoinerSecond = new StringJoiner(" ");
        if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length / 2 + 1; i++) {
                stringJoinerFirst.add(String.valueOf(arr[i]));
            }
            for (int i = arr.length / 2 + 1; i < arr.length; i++) {
                stringJoinerSecond.add(String.valueOf(arr[i]));
            }
        } else {
            for (int i = 0; i < arr.length / 2; i++) {
                stringJoinerFirst.add(String.valueOf(arr[i]));
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                stringJoinerSecond.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(stringJoinerFirst);
        System.out.println(stringJoinerSecond);
    }
}
