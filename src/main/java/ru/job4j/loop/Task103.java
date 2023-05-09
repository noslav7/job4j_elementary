package ru.job4j.loop;

public class Task103 {
    public static void loop(int[] num) {
        int result = 0;
        int min = 10000;
        for (int i = 0; i < num.length; i++) {
            int firstDigit = num[i] / 100;
            int secondDigit = num[i] % 100 / 10;
            int thirdDigit = num[i] % 10;
            if (min > firstDigit + secondDigit + thirdDigit) {
                min = firstDigit + secondDigit + thirdDigit;
                result = num[i];
            }
        }
        System.out.println(result);
    }
}
