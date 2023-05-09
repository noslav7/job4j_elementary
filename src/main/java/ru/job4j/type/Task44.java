package ru.job4j.type;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int cutNumber1 = number1 / 10;
        int cutNumber2 = number2 / 10;
        System.out.println("" + cutNumber1 + lastDigit2);
        System.out.println("" + cutNumber2 + lastDigit1);
    }
}
