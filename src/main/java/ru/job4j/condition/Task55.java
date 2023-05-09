package ru.job4j.condition;

public class Task55 {
    public static void apartmentPlace(int number) {
        int floor, position;
        position = number % 3;
        if (position == 0) {
            floor = number / 3;
            position = 3;
        } else {
            floor = number / 3 + 1;
        }

        System.out.println(floor);
        System.out.println(position);
    }
}
