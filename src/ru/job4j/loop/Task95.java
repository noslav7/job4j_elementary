package ru.job4j.loop;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int toMathClass = 0;
        int toInfoClass = 0;
        int enrolled = 0;
        for (int i = 0; i < math.length; i++) {
            for (int j = 0; j < info.length; j++) {
                if (i == j && math[i] > info[j] && (math[i] + info[i]) / 2 >= 7) {
                    toMathClass++;
                    enrolled++;
                } else if (i == j && math[i] <= info[j] && (math[i] + info[i]) / 2 >= 7) {
                    toInfoClass++;
                    enrolled++;
                    }
                }
            }
        System.out.println("Зачислено: " + enrolled + ", ФМ: " + toMathClass + ", ФИ: " + toInfoClass);
    }
}
