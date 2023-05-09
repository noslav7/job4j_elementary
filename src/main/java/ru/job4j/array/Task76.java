package ru.job4j.array;

public class Task76 {
    public static void array(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            } else if (arr[i] == 3) {
                count3++;
            } else if (arr[i] == 4) {
                count4++;
            } else if (arr[i] == 5) {
                count5++;
            }
        }
        System.out.println("5: " + count5 + ", 4: " + count4 + ", 3: " + count3
                + ", 2: " + count2 + ", 1: " + count1);
    }
}
