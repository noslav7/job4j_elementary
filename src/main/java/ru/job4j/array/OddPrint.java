package ru.job4j.array;

import java.util.Arrays;

public class OddPrint {
    public static void print(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
           int odd = array[i] % 2;
             if (odd == 1) {
                System.out.println(array[i]);
            }
        }
    }
}
