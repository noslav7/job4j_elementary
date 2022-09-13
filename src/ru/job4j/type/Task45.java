package ru.job4j.type;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        int num11, num12, num13, num21, num22, num23;
        num11 = number1 / 100;
        num12 = (number1 % 100) / 10;
        num13 = (number1 % 100) % 10;
        num21 = number2 / 100;
        num22 = (number2 % 100) / 10;
        num23 = (number2 % 100) % 10;
        System.out.println("" + num21 + num12 + num13);
        System.out.println("" + num11 + num22 + num23);
    }
}
