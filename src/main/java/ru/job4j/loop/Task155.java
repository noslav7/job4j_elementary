package ru.job4j.loop;

public class Task155 {
    public static void loop() {
        for (int i = 10; i <= 20; i++) {
            int sum = 0;
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0 && i != j) {
                    sum += j;
                }
            }
            System.out.println("Число: " + i + ", сумма делителей: " + sum);
        }
    }
}
