package ru.job4j.loop;

import java.util.StringJoiner;

public class Task163 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            int sumDividers = 0;
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    sumDividers += j;
                }
            }
            if (sumDividers % 2 == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}
