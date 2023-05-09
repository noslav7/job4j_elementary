package ru.job4j.loop;

public class Task153 {
    public static void loop() {
        int bulls = 0;
        int cows = 20;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Быков: " + bulls + ", коров: " + cows);
            bulls++;
            cows -= 2;
        }
    }
}
