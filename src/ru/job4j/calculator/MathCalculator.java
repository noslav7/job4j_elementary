package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultilpy(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOfSubtractionAndDivision(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static  double sumOfAllOperations(double first, double second) {
        return sum(first, second) + divide(first, second) + subtract(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumOfAllOperations(20, 10));
    }
}
