package ru.job4j.loop;

import java.util.StringJoiner;

public class Task165 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                int countDividers = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        countDividers++;
                    }
                }
                if (countDividers == 2) {
                    stringJoiner.add(String.valueOf(i));
                }
            }
        }
        System.out.println(stringJoiner);
    }
}
