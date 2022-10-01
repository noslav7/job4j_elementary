package ru.job4j.condition;

public class Task66 {
    public static void daytime(int number) {
        if (number >= 6 && number <= 10) {
            System.out.println("Утро");
        } else if (number >= 11 && number <= 17) {
            System.out.println("День");
        } else if (number >= 18 && number <= 22) {
            System.out.println("Вечер");
        } else if (number == 23 || number == 24 || (number >= 1 && number <= 5)) {
            System.out.println("Ночь");
        } else {
            System.out.println("Не является часом");
        }
    }
}
