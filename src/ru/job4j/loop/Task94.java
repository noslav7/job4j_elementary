package ru.job4j.loop;

public class Task94 {
    public static void loop(int[] diameter, int[] weight) {
        int count = 0;
        for (int i = 0; i < diameter.length; i++) {
            for (int j = 0; j < weight.length; j++) {
                if (i == j && diameter[i] >= 22 && diameter[i] <= 26
                        && weight[j] >= 71 && weight[j] <= 77) {
                    count++;
                    if (count == 1) {
                        System.out.print("Да");
                    } else {
                        System.out.print(", Да");
                    }
                } else if (i == j) {
                    count++;
                    if (count == 1) {
                        System.out.print("Нет");
                    } else {
                        System.out.print(", Нет");
                    }
                }
            }
        }
        System.out.println();
    }
}
