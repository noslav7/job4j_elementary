package ru.job4j.condition;

public class Task46 {
    public static void changeNums(int num1, int num2) {
        int numPlus, numMinus;
        if (num1 > num2) {
            num1--;
            num2++;
        } else if (num2 > num1) {
            num2--;
            num1++;
        } else {
            num1++;
            num2++;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
