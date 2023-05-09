package ru.job4j.loop;

import java.util.StringJoiner;

public class Task111 {
    public static void loop(int num) {
        if (num == 1) {
            System.out.print("");
            return;
        }
        int sum = 0;
        int result = 0;
        StringJoiner strJ = new StringJoiner(" ");
        for (int i = num + 1; i < num * num; i++) {
                sum += i;
                if (sum < num * num) {
                    strJ.add("" + i);
                }
        }
        System.out.println(strJ);
    }
}
