package ru.job4j.loop;

public class Task100 {
    public static void loop(int[] num) {
        int digitItself = 0;
        int maxSum = 0;
        for (int i = 0; i < num.length; i++) {
            int first = num[i] / 10;
            int second = num[i] % 10;
            if (first + second > maxSum) {
                maxSum = first + second;
                digitItself = num[i];
            }
        }
        System.out.println(digitItself);
    }

    public static void main(String[] args) {
       int[] num = {24, 35, 19};
        loop(num);
    }
}
