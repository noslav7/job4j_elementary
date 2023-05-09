package ru.job4j.loop;

public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        if (n1 + 1 == n2) {
            System.out.println("Нет чисел");
            return;
        }
        int count = 0;
        int intervalLength = (a2 - a1) / (n2 - n1);
        for (int i = n1 + 1; i < n2; i++) {
            count++;
            if (count == 1) {
                System.out.print(a1 + intervalLength);
            } else {
                System.out.print(" " + (a1 + intervalLength *  count));
            }
        }
        System.out.println();
    }
}
