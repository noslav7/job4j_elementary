package ru.job4j.condition;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int remainder, temp;
        temp = num1;
        remainder = num1 % 10;

        int temp2, remainder2;
        temp2 = num2;
        remainder2 = num2 % 10;

        if (remainder > remainder2) {
            System.out.println(remainder);
        } else if (remainder2 > remainder) {
            System.out.println(remainder2);
        } else {
            System.out.println("Одинаковые");
        }
    }
}
