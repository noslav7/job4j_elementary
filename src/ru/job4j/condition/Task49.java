package ru.job4j.condition;

public class Task49 {
    public static void isPalindrome(int number) {
        int remainder, sum = 0, temp;

        temp = number;
        while (number > 0) {
            remainder = number % 10;  //getting remainder
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
