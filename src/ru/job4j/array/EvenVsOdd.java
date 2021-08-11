package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int result = 0;
        int sumOdd = 0;
        for (int i = 0; i < players.length; i = i + 2) {
            sumOdd = sumOdd + players[i];
        }
        int sumEven = 0;
        for (int i = 1; i < players.length; i = i + 2) {
            sumEven = sumEven + players[i];
        }
        if (sumOdd > sumEven) {
            result = 1;
        } else if (sumEven > sumOdd) {
            result = 2;
        }
        return result;
    }
}
