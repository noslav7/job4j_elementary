package ru.job4j.loop;

import java.util.StringJoiner;

public class Task161 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            int countDividers = 0;
            for (int j = 1; j < 30; j++) {
                if (i % j == 0) {
                    countDividers++;
                }
            }
            if (countDividers > 2) {
                continue;
            } else {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}
