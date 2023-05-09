package ru.job4j.condition;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Все равны");
        }
        if (a != b && b != c && a != c) {
            System.out.println("Равных нет");
        }
        if (a == b && c > a) {
            System.out.println("Первое и второе равны, третье больше");
        }
        if (b == c && a > b) {
            System.out.println("Второе и третье равны, первое больше");
        }
        if (a == c && b > a) {
            System.out.println("Первое и третье равны, второе больше");
        }
        if (a == b && c < a) {
            System.out.println("Первое и второе равны, третье меньше");
        }
        if (b == c && a < b) {
            System.out.println("Второе и третье равны, первое меньше");
        }
        if (a == c && b < a) {
            System.out.println("Первое и третье равны, второе меньше");
        }
    }
}
