package ru.job4j.condition;

public class Task71 {
    public static void change(int money) {
        int hundred, fifty, ten;
        hundred = money / 100;
        fifty = money % 100 / 50;
        ten = money % 100 % 50 / 10;
        if (money % 100 % 50 % 10 > 0) {
            System.out.println("Нельзя");
        } else {
            System.out.println("100: " + hundred + ", 50: " + fifty + ", 10: " + ten);
        }
    }
}
