package ru.job4j.condition;

public class Task59 {
    public static void getLinearEquation(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
            return;
        } else if (a == 0) {
            System.out.println("Нет решения");
            return;
        } else {
            double result = - (double) b / (double) a;
            double moduleResult = Math.abs(result);
            int remainsInt = (int) result;
            double remains = (double) remainsInt;
            double moduleRemains = Math.abs(remains);
            if (moduleResult <= moduleRemains) {
                int intResult = (int) result;
                System.out.println(intResult);
                return;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        getLinearEquation(4,6);
    }
}
