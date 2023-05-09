package ru.job4j.loop;

public class Task90 {
    public static void loop() {
        int count = 0;
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (2 * (firstDigit + secondDigit) == firstDigit * secondDigit) {
                count++;
                if (count == 1) {
                    System.out.print("Числа: " + i);
                    sum = i;
                } else {
                    System.out.print(" " + i);
                    sum = sum + i;
                }
            }
        }
        System.out.println(", Количество: " + count + ", Сумма: " + sum);
    }
}
