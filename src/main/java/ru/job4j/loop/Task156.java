package ru.job4j.loop;

import java.util.StringJoiner;

public class Task156 {
    public static void loop(int num) {
        for (int i = 1; i <= num; i++) {
            StringJoiner stringJoiner = new StringJoiner("");
            String plus = "+";
            for (int j = 1; j <= num; j++) {
                if (i % j == 0) {
                    stringJoiner.add("+");
                }
            }
            System.out.println(i + "" + stringJoiner);
        }
    }
}
