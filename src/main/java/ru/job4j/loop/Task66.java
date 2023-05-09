package ru.job4j.loop;

public class Task66 {
    public static void loop(int num) {
        boolean atLeastOneDividerExists = false;
        int printedNumbers = 0;
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.print("Количество: " + count + ", Делители: ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                atLeastOneDividerExists = true;
                printedNumbers++;
                if (printedNumbers == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
        }
        if (!atLeastOneDividerExists) {
            System.out.print(0);
        }
        System.out.println();
    }
}
