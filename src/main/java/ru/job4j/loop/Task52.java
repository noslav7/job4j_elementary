package ru.job4j.loop;

public class Task52 {
    public static void loop(int n, int m) {
       int count = 0;
       if (n < m) {
           for (int i = m; i < m + n; i++) {
               count++;
               if (count == 1) {
                   System.out.print(i);
               } else {
                   System.out.print(" " + i);
               }
           }
       } else {
           for (int i = n; i < n + m; i++) {
               count++;
               if (count == 1) {
                   System.out.print(i);
               } else {
                   System.out.print(" " + i);
               }
           }
       }
        System.out.println();
    }
}
