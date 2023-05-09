package ru.job4j.loop;

public class Task142 {
    public static void loop(int num) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;
        for (int i = 2; i <= num; i++) {
                thirdNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                if (thirdNumber >= num) {
                    break;
                }
        }
        if (thirdNumber == num || num == 2 || num == 1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
