package ru.job4j.loop;

public class Task117 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num != 0) {
            if ((num % 10) % 2 == 0) {
                sum += num % 10;
                count++;
            }
            num /= 10;
        }
        System.out.println("Количество: " + count + ", сумма: " + sum);
    }
}
