package ru.job4j.loop;

import java.util.StringJoiner;

public class Task133 {
    public static void loop(int num) {
        if (num >= 1000) {
            System.out.print("");
            return;
        }
        int countPower = 1;
        int number = num;
        StringJoiner stringJoiner = new StringJoiner(" ");
        while (number < 1000) {
            stringJoiner.add(String.valueOf(number));
            countPower++;
            number = (int) Math.pow(num, countPower);

        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(6);
    }
}
