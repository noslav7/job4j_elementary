package ru.job4j.loop;

public class Task79 {
    public static void loop(int[] grades) {
        double avg;
        int bad = 0;
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
            if (grades[i] <= 2) {
                bad++;
            }
        }
        avg = sum / (double) grades.length;
        System.out.println("Средняя оценка: " + avg + ", неуд. оценка: " + bad);
    }
}
