package ru.job4j.condition;

public class Point {

            public static double distance(double x1, double y1, double x2, double y2) {
                return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }

        public static void main(String[] args) {
            double result = Point.distance(0, 0, 10, 10);
            System.out.println("result (0, 0) to (10, 10) " + result);
        }
}
