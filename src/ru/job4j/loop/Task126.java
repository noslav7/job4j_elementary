package ru.job4j.loop;

public class Task126 {
    public static void loop(int num) {
        String numString = String.valueOf(num);
        StringBuilder secondRow = new StringBuilder();
        StringBuilder firstRow = new StringBuilder();
        int count = 0;
        while (num != 0) {
            count++;
            int lastDigit = num % 10;
            if (count % 2 == 0) {
                if (secondRow.isEmpty()) {
                    secondRow.append(String.valueOf(lastDigit));
                } else {
                    secondRow.append(" ").append(String.valueOf(lastDigit));
                }
            } else {
                if (firstRow.isEmpty()) {
                    firstRow.append(String.valueOf(lastDigit));
                } else {
                    firstRow.append(" ").append(String.valueOf(lastDigit));
                }
            }
            num /= 10;
        }

        if (numString.length() % 2 == 0) {
            System.out.println(firstRow.reverse());
            System.out.println(secondRow.reverse());
        } else {
            System.out.println(secondRow.reverse());
            System.out.println(firstRow.reverse());
        }
    }

    public static void main(String[] args) {
        loop(20);
    }
}
