package ru.job4j.loop;

public class Task130 {
    public static void loop(int num) {
        int countZero = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0) {
                countZero++;
            }
            num /= 10;

        }
        System.out.println(countZero);
    }
}
