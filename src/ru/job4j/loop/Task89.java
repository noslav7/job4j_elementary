package ru.job4j.loop;

public class Task89 {
    public static void loop() {
        int count = 0;
        for (int i = 0; i <= 999; i++) {
            int firstDigit = i / 100;
            int secondDigit = i % 100 / 10;
            int thirdDigit = i % 10;
            double cube = Math.pow((double) (firstDigit + secondDigit + thirdDigit), 3.0);
            if (cube == (double) i) {
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
