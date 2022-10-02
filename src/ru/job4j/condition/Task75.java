package ru.job4j.condition;

public class Task75 {
    public static void innerNum(int num2, int num4) {
        int num21, num22, num41, num42, num43, num44, count = 0;
        num21 = num2 / 10;
        num22 = num2 % 10;
        num41 = num4 / 1000;
        num42 = num4 % 1000 / 100;
        num43 = num4 % 1000 % 100 / 10;
        num44 = num4 % 1000 % 100 % 10;
        if (num21 == num41 && num22 == num42) {
            count++;
        }
        if (num21 == num42 && num22 == num43) {
            count++;
        }
        if (num21 == num43 && num22 == num44) {
            count++;
        }
        System.out.println(count);
    }
}
