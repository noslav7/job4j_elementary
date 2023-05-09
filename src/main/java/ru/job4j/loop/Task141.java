package ru.job4j.loop;

import java.util.StringJoiner;

public class Task141 {
    public static void loop(int x, int y) {
        int count = 0;
        StringJoiner stringJoiner = new StringJoiner(" ");
        if (x - y == 1 || y - x == 1) {
            stringJoiner.add(String.valueOf(0));
        }
        if (x > y) {
            while (x != y) {
                if (x % 2 != 0) {
                    x--;
                } else {
                    x /= 2;
                }
                if (x != y) {
                    stringJoiner.add(String.valueOf(x));
                    count++;
                }
            }
        } else {
            while (x != y) {
                if (y % 2 != 0) {
                    y--;
                } else {
                    y /= 2;
                }
                if (x != y) {
                    stringJoiner.add(String.valueOf(y));
                    count++;
                }
            }
        }
        System.out.println("Числа: " + stringJoiner + ", Количество: " + count);
    }
}
