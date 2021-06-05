package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultilpy(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second) + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double sumOfSubtractionAndDivision(double first, double second) {
        return MathFunction.subtract(first, second) + MathFunction.divide(first, second);
    }

    public static  double sumOfAllOperations(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.divide(first, second) + MathFunction.subtract(first, second) + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumOfAllOperations(20, 10));
    }
}
