package ru.job4j.loop;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg;
        double badAvg;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 3) {
                sumGood = sumGood + grades[i];
                good++;
            }
            if (grades[i] <= 2) {
                sumBad = sumBad + grades[i];
                bad++;
            }
        }
        if (good == 0) {
            goodAvg = 0;
        } else {
            goodAvg = sumGood / (double) good;
        }
        if (bad == 0) {
            badAvg = 0;
        } else {
            badAvg = sumBad / (double) bad;
        }
        System.out.println("Средняя удовл. оценка: " + goodAvg + ", средняя неуд. оценка: " + badAvg);
    }
}
