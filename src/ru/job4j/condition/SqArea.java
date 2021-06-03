package ru.job4j.condition;

public class SqArea {
    public static double square(int perimeter, double heightToWidth) {
       double height = perimeter / (2 * (heightToWidth + 1));
       double width = height * heightToWidth;
       return width * height;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" perimeter = 6, heightToWidth = 2, square = 2, real = " + result1);
    }
}
