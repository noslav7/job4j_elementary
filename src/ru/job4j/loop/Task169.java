package ru.job4j.loop;

import java.util.Scanner;

public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        int i, j, k;

        for (i = 0 ; i <= columnCount - 1; i++ ) {
            for (j = 0 ; j < i; j++ ) {
                System.out.print(" ");
            }
            for(k = i; k <= columnCount - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = columnCount - 1; i >= 0; i-- ) {
            for (j = 0 ; j < i; j++ ) {
                System.out.print(" ");
            }
            for(k = i; k <= columnCount - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
