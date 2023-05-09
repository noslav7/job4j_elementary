package ru.job4j.loop;

public class Task120 {
    public static void loop(int num) {
        while (num != 0) {
            num /= 10;
            if (num != 0) {
                System.out.print(num + " ");
            } else {
                System.out.println(num);
            }
        }
    }
}
