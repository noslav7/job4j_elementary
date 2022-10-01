package ru.job4j.condition;

public class Task58 {
    public static void isWinning(int number) {
        int num1, num2, num3, num4, num5, num6, sumFirstThree, sumLastThree;
        num1 = number / 100000;
        num2 = number % 100000 / 10000;
        num3 = number % 100000 % 10000 / 1000;
        num4 = number % 100000 % 10000 % 1000 / 100;
        num5 = number % 100000 % 10000 % 1000 % 100 / 10;
        num6 = number % 100000 % 10000 % 1000 % 100 % 10;
        sumFirstThree = num1 + num2 + num3;
        sumLastThree = num4 + num5 + num6;
        if (sumFirstThree == sumLastThree && sumFirstThree % 2 == 0) {
            System.out.println("Да");
        }
        if (sumFirstThree == sumLastThree && sumFirstThree % 2 != 0) {
            System.out.println("Нет");
        }
        if (sumFirstThree != sumLastThree) {
            System.out.println("Нет");
        }
    }
}
