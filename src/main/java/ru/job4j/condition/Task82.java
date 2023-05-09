package ru.job4j.condition;

public class Task82 {
    public static boolean isEquals(String first, String second) {
        boolean isEqual = false;
        if (first.equals(second)) {
            isEqual = true;
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        return isEqual;
    }
}
