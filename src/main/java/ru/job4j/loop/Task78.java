package ru.job4j.loop;

public class Task78 {
    public static void loop(int[] days, int[] values) {
        int dangerousDaysNumber = 0;
        int clearTuesdays = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] == 2 && values[i] <= 5) {
                clearTuesdays++;
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 7) {
                dangerousDaysNumber++;
            }
        }
        System.out.println("Опасно: " + dangerousDaysNumber + ", спокойный вторник: " + clearTuesdays);
    }
}
