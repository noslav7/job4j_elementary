package ru.job4j.loop;

public class Task125 {
    public static void loop(int num) {
        StringBuilder oddDigits = new StringBuilder();
        StringBuilder evenDigits = new StringBuilder();
        int countOdd = 0;
        int countEven = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                countEven++;
                if (countEven == 1) {
                    evenDigits.append(String.valueOf(lastDigit));
                } else {
                    evenDigits.append(" ").append(String.valueOf(lastDigit));
                }
            } else {
                countOdd++;
                if (countOdd == 1) {
                    oddDigits.append(String.valueOf(lastDigit));
                } else {
                    oddDigits.append(" ").append(String.valueOf(lastDigit));
                }
            }
            num /= 10;
        }
        if (!evenDigits.reverse().isEmpty()) {
            System.out.println(evenDigits);
        }
        if (!(oddDigits.reverse().isEmpty())) {
            System.out.println(oddDigits);
        }
    }
}
