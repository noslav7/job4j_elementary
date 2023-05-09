package ru.job4j.type;

public class Task19 {
    public static void sumAndConvert(double money, double gift, double ratio) {
        double euro = (money * 1.00 + gift * 1.00) * ratio;
        System.out.printf("%.2f", euro);
    }
}
