package ru.job4j.condition;

public class Task53 {
    public static void transformFraction(int num1, int num2) {
        if (num1 >= num2) {
            if (num1 % num2 != 0) {
                System.out.println(num1 / num2 + " " + num1 % num2 + "/" + num2);
            } else {
                System.out.println(num1 / num2);
            }
        } else {
            System.out.println("Подсчет не производится");
        }
    }
}
