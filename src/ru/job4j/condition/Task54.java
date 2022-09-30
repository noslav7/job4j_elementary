package ru.job4j.condition;

public class Task54 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 100 % 10;
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
            if (num1 % 2 == 0 && num1 != 0) {
                if (num1 > 0) {
                    num1--;
                }
                if (num1 % 2 != 0 && num1 != 9 && num1 != -9) {
                    num1++;
                }
                if (num2 % 2 == 0 && num2 != 0) {
                    num1--;
                }
                if (num2 % 2 != 0 && num1 != 9 && num1 != -9) {
                    num2++;
                }
                if (num3 % 2 == 0 && num3 != 0) {
                    num3--;
                }
                if (num3 % 2 != 0 && num3 != 9 && num1 != -9) {
                    num3++;
                }
            }
            String stringResult = "" + num1 + num2 + num3;
            int intResult = Integer.parseInt(stringResult);
            System.out.println(intResult);
        }
    }
}
