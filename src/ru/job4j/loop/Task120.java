package ru.job4j.loop;

public class Task120 {
    public static void loop(int num) {
        StringBuilder results = new StringBuilder();
        String digitString = "";
        int count = 0;
        int lastNumber = 0;
        while (num != 0) {
            lastNumber = num % 10;
            digitString = digitString + String.valueOf(lastNumber);
            count++;
            if (count == 1) {
              results.append(digitString);
            } else {
                results.append(" ").append(digitString);
            }
            num /= 10;
        }
        System.out.println(results);
    }
}
