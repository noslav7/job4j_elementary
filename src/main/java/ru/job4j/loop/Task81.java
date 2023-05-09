package ru.job4j.loop;

public class Task81 {
    public static void loop(int num) {
        int oneDigit = num / 10;
        int anotherDigit = num % 10;
        int sum = 0;
        if (oneDigit < anotherDigit) {
            for (int i = oneDigit; i <= anotherDigit; i++) {
                sum = sum + i;
            }
        } else {
            for (int i = anotherDigit; i <= oneDigit; i++) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
