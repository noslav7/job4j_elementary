package ru.job4j.loop;

import java.util.StringJoiner;

public class Task166 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            int sumUnevenDividers = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j % 2 != 0) {
                    sumUnevenDividers += j;
                }
            }
            if (i % 10 == 0 && sumUnevenDividers % 10 == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}
