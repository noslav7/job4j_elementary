package ru.job4j.loop;

import java.util.StringJoiner;

public class Task145 {
    public static void loop(int num1, double num2) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        double num1Double = (double) num1;
        int count = 0;
        while (num1Double > 1 + num2) {
           String roundedResult = String.format("%.1f", Math.sqrt(num1Double));
           num1Double = Double.parseDouble(roundedResult);
           if (num1Double > 1 + num2) {
               stringJoiner.add(roundedResult);
               count++;
           }
        }
        System.out.println("Промежуточные: " + stringJoiner + ", Количество: " + count);
    }

    public static void main(String[] args) {
        loop(9, 1.6);
    }
}
