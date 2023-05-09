package ru.job4j.loop;

import java.util.StringJoiner;

public class Task164 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int square = 0;
        for (int i = 10; i < 20; i++) {
            square = i * i;
            if (square <= 300) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}
