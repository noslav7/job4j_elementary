package ru.job4j.condition;

public class Task79 {
    public static void getCentury(int num) {
        if (num >= 1501 && num <= 1600) {
            System.out.println(16);
        } else if (num >= 1601 && num <= 1700) {
            System.out.println(17);
        } else if (num >= 1701 && num <= 1800) {
            System.out.println(18);
        } else if (num >= 1801 && num <= 1900) {
            System.out.println(19);
        } else if (num >= 1901 && num <= 2000) {
            System.out.println(20);
        } else {
            System.out.println("Не попадает в диапазон");
        }
    }
}
