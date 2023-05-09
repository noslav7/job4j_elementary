package ru.job4j.loop;

public class Task160 {
    public static void loop(int num) {
        int sumDividersNum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumDividersNum += i;
            }
        }

        int sumDividersNumNext = 0;
        int numNext = num;
        while (sumDividersNumNext != num) {
            numNext++;
            sumDividersNumNext = 0;
            for (int i = 1; i <= numNext / 2; i++) {
                if (numNext % i == 0) {
                    sumDividersNumNext += i;
                }
            }
        }

        System.out.println(numNext);
    }
}
