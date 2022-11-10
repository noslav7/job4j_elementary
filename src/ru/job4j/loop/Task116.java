package ru.job4j.loop;

public class Task116 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
            count++;
        }
        System.out.println("Количество: " + count + ", сумма: " + sum);
    }
}
