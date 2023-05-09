package ru.job4j.loop;

import java.util.Scanner;

public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        int i, j, k;

        for (i = 0 ; i <= columnCount - 1; i = i + 2) {
            for (j = 0 ; j < i; j = j + 2) {
                System.out.print(" ");
            }
            for(k = i; k <= columnCount - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = columnCount - 3; i >= 0; i = i - 2 ) {
            for (j = 0 ; j < i; j = j + 2) {
                System.out.print(" ");
            }
            for(k = i; k <= columnCount - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
