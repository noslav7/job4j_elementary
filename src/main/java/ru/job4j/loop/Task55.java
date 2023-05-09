package ru.job4j.loop;

public class Task55 {
    public static void loop(int[] array) {
        int countEven = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                odd++;
            }
        }
        System.out.println("Четных: " + countEven + ", нечетных: " + odd);
    }
}
