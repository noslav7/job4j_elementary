package ru.job4j.loop;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        int interval1 = n2 - n1;
        int interval2 = n3 - n2;
        if (interval1 == interval2) {
            System.out.println((n3 + interval1) + " " + (n3 + 2 * interval1) + " " + (n3 + 3 * interval1));
        } else {
            System.out.println("Нет");
        }
    }
}
