package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int countPositive = 0;
        int countNegative = 0;
        boolean posEvenNegUneven = false;
        for (int datum : data) {
            if (datum > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        if (countNegative % 2 == 1) {
            posEvenNegUneven = true;
        }
        if (countPositive % 2 == 0) {
            posEvenNegUneven = false;
        }
        return posEvenNegUneven;
    }
}
