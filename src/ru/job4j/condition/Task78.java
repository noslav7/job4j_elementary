package ru.job4j.condition;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        int num1, num2, num3, count = 0;
        num1 = num / 100;
        num2 = num % 100 / 10;
        num3 = num % 100 % 10;
        if (num1 != 0) {
            if (num % num1 == 0) {
                count++;
                System.out.print(num1);
            }
        }
        if (num2 != 0) {
            if (num % num2 == 0) {
                count++;
                System.out.print(" " + num2);
            }
        }
        if (num3 != 0) {
            if (num % num3 == 0) {
                count++;
                System.out.print(" " + num3);
            }
        }
        if (count == 0) {
            System.out.print("Таких чисел нет");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        divWithoutRemainder(100);
    }
}
