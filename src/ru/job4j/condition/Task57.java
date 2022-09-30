package ru.job4j.condition;

public class Task57 {
    public static void triangleType(int a, int b) {
        int c = 180 - a - b;
        if (a + b + c > 180 || (a + b) >= 180 || (b + c) >= 180 || (a + c) >= 180) {
            System.out.println("Ошибка");
            return;
        }
        if (a < 90 && b < 90 && c < 90) {
            System.out.println("Остроугольный");
        }
        if (a == 90 || b == 90 || c == 90 ) {
            System.out.println("Прямоугольный");
        }
        if (a > 90 || b > 90 || c > 90) {
            System.out.println("Тупоугольный");
        }
        if ( a == b || b == c || a == c) {
            System.out.println("Равнобедренный");
        }
        if (a == b && b == c) {
            System.out.println("Равносторонний");
        }
    }
}
