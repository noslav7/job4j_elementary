package ru.job4j.array;

public class SumWithStopEl {

    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != el) {
                sum = sum + data[i];
            } else {
                break;
            }
        }
            if (sum % 2 == 1) {
                    sum = 0;
                }
            return sum;
    }
}
