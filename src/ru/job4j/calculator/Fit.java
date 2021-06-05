package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double height = 180;
        double man = Fit.manWeight(height);
        System.out.println("Man 180 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 180 is " + woman);
    }
}
