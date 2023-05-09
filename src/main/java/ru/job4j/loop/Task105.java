package ru.job4j.loop;

public class Task105 {
    public static void loop(int[] num) {
        int result = 0;
        int max = -100000;
        for (int i = 0; i < num.length; i++) {
            int firstDigit = num[i] / 100;
            int secondDigit = num[i] % 100 / 10;
            int thirdDigit = num[i] % 10;
            if (max < firstDigit + secondDigit + thirdDigit) {
                max = firstDigit + secondDigit + thirdDigit;
                result = i;
            }
        }
        System.out.println(result);
    }
}
