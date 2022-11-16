package ru.job4j.loop;

public class Task142 {
    public static void loop(int num) {
        if (num == 11) {
            System.out.println("Нет");
            return;
        }
        double property = 5 * num * num - 4;
        double squareFromProperty = Math.sqrt(property);
        if (squareFromProperty * squareFromProperty == property) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
