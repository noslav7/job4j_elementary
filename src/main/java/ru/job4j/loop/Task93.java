package ru.job4j.loop;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int sumFinal = 0;
        int finalParticipants = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (i == j && first[i] + second[j] >= 80) {
                    sumFinal = sumFinal + first[i] + second[j];
                    finalParticipants++;
                }
            }
        }
        System.out.println("В финале: " + finalParticipants + ", сумма баллов: " + sumFinal);
    }
}
