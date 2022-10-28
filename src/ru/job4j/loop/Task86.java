package ru.job4j.loop;

public class Task86 {
    public static void loop(int num) {
        int firstIncomingDigit = num / 10;
        int secondIncomingDigit = num % 10;
        int incomingSum = firstIncomingDigit + secondIncomingDigit;
        int generatedDigit = num * 2;
        int firstGeneratedDigit = generatedDigit / 10;
        int secondGeneratedDigit = generatedDigit % 10;
        int generatedSum = firstGeneratedDigit + secondGeneratedDigit;
        if (generatedSum == incomingSum) {
            System.out.println("Да");
            return;
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(12);
    }
}

