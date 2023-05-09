package ru.job4j.condition;

public class Task54 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = Math.abs(number) / 100;
        num2 = Math.abs(number) % 100 / 10;
        num3 = Math.abs(number) % 100 % 10;
        if (number % 2 == 0) {
            if (num1 % 2 == 0) {
                num1++;
            } else {
                num1--;
            }
            if (num2 % 2 == 0) {
                num2++;
            } else {
                num2--;
            }
            if (num3 % 2 == 0) {
                num3++;
            } else {
                num3--;
            }
        } else {
            if (num1 % 2 == 0) {
                if (num1 != 0) {
                    num1--;
                }
            } else {
                if (num1 != 9) {
                    num1++;
                }
            }
            if (num2 % 2 == 0) {
                if (num2 != 0) {
                    num2--;
                }
            } else {
                if (num2 != 9) {
                    num2++;
                }
            }
            if (num3 % 2 == 0) {
                if (num2 != 0) {
                    num3--;
                }
            } else {
                if (num3 != 9) {
                    num3++;
                }
            }
        }
        String stringResult = "" + num1 + num2 + num3;
        int intResult = Integer.parseInt(stringResult);
        if (number < 0) {
            intResult = intResult * -1;
        }
        System.out.println(intResult);
    }

    public static void main(String[] args) {
        transform(333);
    }
}
