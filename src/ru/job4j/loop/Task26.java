package ru.job4j.loop;

public class Task26 {
    public static void loop(int num) {
        for (int i = 0; i > 2 * num * -8; i = i - 8) {
            int last = (2 * num * -8) + 8;
            if (i <= last) {
                System.out.println(i);
                break;
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        loop(2);
    }
}
