package ru.job4j.loop;

public class Task149 {
    public static void loop(int[] grades) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] <= 5 && grades[i] >= 1) {
                sum = sum + grades[i];
                count++;
            } else {
                break;
            }
        }
        double avg = ((double) sum) / count;
        String average = String.format("%.2f", avg);
        System.out.println(average);
    }
}
