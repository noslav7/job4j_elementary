package ru.job4j.loop;

import java.util.StringJoiner;

public class Task157 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    sum += j;
                }
            }
            if (sum == i) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}
