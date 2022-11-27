package ru.job4j.loop;

import java.util.StringJoiner;

public class Task167 {
    public static void loop(int[] first, int[] second, int[] third) {
        double avgFirst = 0;
        int sumFirst = 0;
        StringJoiner joiner1 = new StringJoiner(" ");
        for (int i = 0; i < first.length; i++) {
            joiner1.add(String.valueOf(first[i]));
            sumFirst += first[i];
        }
        avgFirst = ((double) sumFirst) / 5;
        String avgPrint1 = String.format("%.1f", avgFirst);
        System.out.println("Оценки: " + joiner1 + ", средняя: " + avgPrint1);

        double avgSecond = 0;
        int sumSecond = 0;
        StringJoiner joiner2 = new StringJoiner(" ");
        for (int i = 0; i < second.length; i++) {
            joiner2.add(String.valueOf(second[i]));
            sumSecond += second[i];
        }
        avgSecond = ((double) sumSecond) / 5;
        String avgPrint2 = String.format("%.1f", avgSecond);
        System.out.println("Оценки: " + joiner2 + ", средняя: " + avgPrint2);

        double avgThird = 0;
        int sumThird = 0;
        StringJoiner joiner3 = new StringJoiner(" ");
        for (int i = 0; i < third.length; i++) {
            joiner3.add(String.valueOf(third[i]));
            sumThird += third[i];
        }
        avgThird = ((double) sumThird) / 5;
        String avgPrint3 = String.format("%.1f", avgThird);
        System.out.println("Оценки: " + joiner3 + ", средняя: " + avgPrint3);

        int count = 0;
        double avgDouble1 = Double.parseDouble(avgPrint1);
        if (avgDouble1 > 4.5) {
            count++;
        }
        double avgDouble2 = Double.parseDouble(avgPrint2);
        if (avgDouble2 > 4.5) {
            count++;
        }
        double avgDouble3 = Double.parseDouble(avgPrint3);
        if (avgDouble3 > 4.5) {
            count++;
        }
        double highest = Math.max(Math.max(avgDouble1, avgDouble2), avgDouble3);
        System.out.println("Выше 4.5: " + count + ", наивысшая: " + highest);
    }
}
