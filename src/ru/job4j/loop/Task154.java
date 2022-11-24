package ru.job4j.loop;

import java.util.StringJoiner;

public class Task154 {
    public static void loop() {
        for (int i = 10; i <= 20; i++) {
            StringJoiner stringJoiner = new StringJoiner(" ");
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0 && i != j) {
                    stringJoiner.add(String.valueOf(j));
                }
            }
            System.out.println("Число: " + i + ", делители: " + stringJoiner);
        }
    }
}
