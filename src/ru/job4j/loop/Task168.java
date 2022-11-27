package ru.job4j.loop;

public class Task168 {
    public static void loop(int num1, int num2, int num3) {
        int num1forDelimitersCount = num1;
        int number1 = 0;
        int countDigits1 = 0;
        int sumDigits1 = 0;
        while (num1 != 0) {
            int digit = num1 % 10;
            sumDigits1 += digit;
            number1 = number1 * 10 + digit;
            num1 /= 10;
            countDigits1++;
        }
        int countDividers1 = 0;
        for (int i = 1; i <= num1forDelimitersCount; i++) {
            if (num1forDelimitersCount % i == 0) {
                countDividers1++;
            }
        }
        System.out.println("Цифр: " + countDigits1 + ", сумма цифр: " + sumDigits1 + ", делителей: " + countDividers1);

        int num2forDelimitersCount = num2;
        int number2 = 0;
        int countDigits2 = 0;
        int sumDigits2 = 0;
        while (num2 != 0) {
            int digit = num2 % 10;
            sumDigits2 += digit;
            number2 = number2 * 10 + digit;
            num2 /= 10;
            countDigits2++;
        }
        int countDividers2 = 0;
        for (int i = 1; i <= num2forDelimitersCount; i++) {
            if (num2forDelimitersCount % i == 0) {
                countDividers2++;
            }
        }
        System.out.println("Цифр: " + countDigits2 + ", сумма цифр: " + sumDigits2 + ", делителей: " + countDividers2);

        int num3forDelimitersCount = num3;
        int number3 = 0;
        int countDigits3 = 0;
        int sumDigits3 = 0;
        while (num3 != 0) {
            int digit = num3 % 10;
            sumDigits3 += digit;
            number3 = number3 * 10 + digit;
            num3 /= 10;
            countDigits3++;
        }
        int countDividers3 = 0;
        for (int i = 1; i <= num3forDelimitersCount; i++) {
            if (num3forDelimitersCount % i == 0) {
                countDividers3++;
            }
        }
        System.out.println("Цифр: " + countDigits3 + ", сумма цифр: " + sumDigits3 + ", делителей: " + countDividers3);

        System.out.println("Сумма всех цифр: " + (sumDigits1 + sumDigits2 + sumDigits3));
    }
}
