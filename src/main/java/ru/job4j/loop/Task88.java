package ru.job4j.loop;

public class Task88 {

    public static void loop() {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (3 * firstDigit * secondDigit == i) {
                count++;
                if (count == 1) {
                    System.out.print("Числа: " + i);
                } else {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println(", Количество: " + count);
    }
}
