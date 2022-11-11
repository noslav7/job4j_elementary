package ru.job4j.loop;

import java.util.StringJoiner;

public class Task123 {
    public static void loop(int num) {
        if (num < 10) {
            System.out.print("");
            return;
        }
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 0;
        while (num != 0) {
            int remains = num % 10;
            sum += remains;
            num /= 10;
        }
        joiner.add(String.valueOf(sum));
        int newNumberSum = sum;
        while (newNumberSum != 0) {
            if (newNumberSum < 10) {
                break;
            }
            int singleSum = 0;
            while (newNumberSum != 0) {
                int remains = newNumberSum % 10;
                singleSum += remains;
                newNumberSum /= 10;
            }
            joiner.add(String.valueOf(singleSum));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(6);
    }
}
