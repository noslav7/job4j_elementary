package ru.job4j.loop;

public class Task43 {
    public static void loop() {
        int count = 0;
        for (int i = 300; i < 325; i++) {
            int lastTwoDigits = i % 100;
            if (lastTwoDigits > 9 && lastTwoDigits % 3 == 0) {
                count++;
                if (count == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println();
    }
}
