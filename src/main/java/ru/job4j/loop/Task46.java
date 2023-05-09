package ru.job4j.loop;

public class Task46 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 1000; i < 1500; i++) {
            int secondDigit = i % 1000 / 100;
            int thirdDigit = i % 100 / 10;
            String stringDigitsPair = "" + secondDigit + thirdDigit;
            int intDigitPair = Integer.parseInt(stringDigitsPair);
            if (intDigitPair == num) {
                count++;
                if (count == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println();
    }
}
