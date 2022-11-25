package ru.job4j.loop;

public class Task159 {
    public static void loop() {
        int indexOfMax = 0;
        int maxSum = 0;
        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            for (int j = 1; j < 10000; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
    }
}
