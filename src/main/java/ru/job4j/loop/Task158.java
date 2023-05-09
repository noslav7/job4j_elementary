package ru.job4j.loop;

public class Task158 {
    public static void loop(int num) {
        for (int i = 1; i <= num; i++) {
            int firstSquare = i * i;
            int secondSquare = num - firstSquare;

            boolean rootIsInteger = false;
            for (int j = 1; j <= secondSquare / 2; j++) {
                int jSquare = j * j;
                if (jSquare == secondSquare) {
                    rootIsInteger = true;
                    break;
                } else if (jSquare > secondSquare) {
                    break;
                } else {
                    continue;
                }
            }

            if (rootIsInteger && secondSquare > 0) {
                    System.out.println("Да");
                    return;
            }
        }
        System.out.println("Нет");
    }
}
