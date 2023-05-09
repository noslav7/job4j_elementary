package ru.job4j.loop;

public class Task118 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num != 0) {
            if ((num % 10) % 2 == 0) {
                count++;
            } else {
                sum += num % 10;
            }
            num /= 10;
        }
        System.out.println("Количество чет: " + count + ", сумма нечет: " + sum);
    }
}
