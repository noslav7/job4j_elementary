package ru.job4j.condition;

public class Task65 {
    public static void season(int number) {
        if (number == 1 || number == 2 || number == 12) {
            System.out.println("Зима");
        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("Весна");
        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Лето");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Не является месяцем");
        }
    }
}
