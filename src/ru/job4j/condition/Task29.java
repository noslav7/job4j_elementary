package ru.job4j.condition;

public class Task29 {
    public static void triangleCheck(double side1, double side2, double hypotenuse) {
        if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
