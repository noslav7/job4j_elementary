package ru.job4j.loop;

import java.util.StringJoiner;

public class Task152 {
    public static void loop() {
        StringJoiner stringJoiner1 = new StringJoiner(" ");
        StringJoiner stringJoiner2 = new StringJoiner(" ");
        StringJoiner stringJoiner3 = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                stringJoiner1.add(String.valueOf(i));
            }
            if (i % 3 == 0) {
                stringJoiner2.add(String.valueOf(i));
            }
            if (i % 4 == 0) {
                stringJoiner3.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner1);
        System.out.println(stringJoiner2);
        System.out.println(stringJoiner3);
    }
}
