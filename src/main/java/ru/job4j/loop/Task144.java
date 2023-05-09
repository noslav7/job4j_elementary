package ru.job4j.loop;

public class Task144 {
    public static void loop(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println(1);
        }
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 % num2 == 0) {
            System.out.println(num2);
        } else {
            loop(num2, num1 % num2);
        }
    }
}
