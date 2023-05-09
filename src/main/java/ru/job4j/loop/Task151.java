package ru.job4j.loop;

import java.util.StringJoiner;

public class Task151 {
    public static void loop() {
        for (int i = 1; i <= 9; i++) {
            StringJoiner stringJoiner = new StringJoiner(" ");
            for (int j = 1; j <= 9; j++) {
                stringJoiner.add(String.valueOf(i * j));
            }
            System.out.println(stringJoiner);
        }
    }
}
