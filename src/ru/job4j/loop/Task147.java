package ru.job4j.loop;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int byers = 0;
        int refusals = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] <= num) {
                num -= tickets[i];
                byers++;
            } else {
                refusals++;
            }
            if (num == 0) {
                break;
            }
        }
        System.out.println("Покупатели: " + byers + ", отказано: " + refusals);
    }
}
