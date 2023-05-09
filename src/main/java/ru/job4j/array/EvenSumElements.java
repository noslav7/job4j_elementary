package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
    int sum = 0;
    boolean even = false;
        for (int cell : data) {
            sum = sum + cell;
        }
        if (sum % 2 == 0) {
            even = true;
        }
        return even;
    }
}
