package ru.job4j.condition;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int remainder, sum = 0, temp;

        temp = num1;
        while (num1 > 10) {
            remainder = num1 % 10;
            sum = (sum * 10) + remainder;
            num1 = num1 / 10;
        }
        int temp2 = num2;
        int remainder2, sum2 = 0;
        while (num2 > 10) {
            remainder2 = num2 % 10;
            sum2 = (sum2 * 10) + remainder2;
            num2 = num2 / 10;
        }
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("Одинаковые");
        }
    }
}