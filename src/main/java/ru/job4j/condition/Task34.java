package ru.job4j.condition;

public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (chairs > pupils) {
            System.out.println("Лишних стульев: " + (chairs - pupils));
        } else if (pupils > chairs) {
            System.out.println("Не хватает стульев: " + (pupils - chairs));
        } else {
            System.out.println("Соответствует");
        }
    }
}
