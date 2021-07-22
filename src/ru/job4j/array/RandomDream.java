package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String prize = null;
        if (num > prizes.length) {
            if (num % prizes.length != 0) {
                num = num % prizes.length;
            } else {
                num = prizes.length;
            }
        }
        for (int i = 0; i < prizes.length; i++) {
            if (num == i + 1) {
                prize = prizes[i];
                break;
            }
        }
        return prize;
    }
}
