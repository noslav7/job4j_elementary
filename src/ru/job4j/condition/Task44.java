package ru.job4j.condition;

public class Task44 {
    public static void containsZero(int number) {
        int reducedNumber = number / 10;
        int resultNumber;
        if (number % 10 < 5) {
            resultNumber = reducedNumber * 10;
        } else {
            resultNumber = (reducedNumber + 1) * 10;
        }
        System.out.println(resultNumber);
    }
}
