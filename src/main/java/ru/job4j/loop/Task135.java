package ru.job4j.loop;

public class Task135 {
    public static void loop(int num) {
        if (num % 10 == 0) {
            num /= 10;
        }
        String numStr = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder(numStr);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
