package ru.job4j.loop;

public class Task68 {
    public static void loop(int num1, int num2) {
        int countDividers1 = 0;
        int countDividers2 = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                countDividers1++;
            }
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                countDividers2++;
            }
        }

        if (countDividers1 == countDividers2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
