package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
       double s = 1;
       double c = p / (2 * (k + 1));
       double b = c * 2;
       return s * b;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);
    }
}
