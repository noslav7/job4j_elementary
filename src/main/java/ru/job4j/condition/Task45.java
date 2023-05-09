package ru.job4j.condition;

public class Task45 {
    public static void changeToRoundNum(int number) {
        int reducedNumber = number / 10;
        int resultNumber;
        if (number % 2 == 0) {
            resultNumber = (reducedNumber + 1) * 10;
            System.out.println("Увеличено до " + resultNumber);
        } else {
            resultNumber = reducedNumber * 10;
            System.out.println("Уменьшено до " + resultNumber);
        }
    }
}
