package ru.job4j.condition;

public class Point {

            public static double distance(double x1, double y1, double x2, double y2) {
            double x = x2 - x1;
            double y = y2 - y1;
            double powx = Math.pow(x, 2);
            double powy = Math.pow(y, 2);
            double xy = powx + powy;
            double result = Math.sqrt(xy);
            return result;
        }

        public static void main(String[] args) {
            double result = Point.distance(0, 0, 10, 10);
            System.out.println("result (0, 0) to (10, 10) " + result);
        }
}
