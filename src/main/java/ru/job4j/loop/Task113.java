package ru.job4j.loop;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (i == j && first[i] != second[i]) {
                    sum1 += first[i];
                    sum2 += second[i];
                } else if (i == j && first[i] == second[i]) {
                    System.out.println("Сумма1: " + sum1 + ", сумма2: " + sum2);
                    return;
                }
            }
        }
    }
}
