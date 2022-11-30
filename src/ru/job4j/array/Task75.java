package ru.job4j.array;

import java.util.StringJoiner;

public class Task75 {
    public static void array(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
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
            } else if (arr[i] == 6) {
                count6++;
            } else if (arr[i] == 7) {
                count7++;
            } else if (arr[i] == 8) {
                count8++;
            } else if (arr[i] == 9) {
                count9++;
            }
        }

        int max = Math.max(count1, Math.max(count3, Math.max(count4, Math.max(count5, Math.max(count6,
                Math.max(count7, Math.max(count8, count9)))))));
        int min = Math.min(count1, Math.max(count3, Math.max(count4, Math.max(count5, Math.max(count6,
                Math.max(count7, Math.max(count8, count9)))))));

        StringJoiner stringJoinerMax = new StringJoiner(" ");
        StringJoiner stringJoinerMin = new StringJoiner(" ");
        StringBuilder stringBuilderMiddle = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                stringJoinerMax.add(String.valueOf(arr[i]));
            } else if (arr[i] == min) {
                stringJoinerMin.add(String.valueOf(arr[i]));
            } else {
                stringBuilderMiddle.append(arr[i]);
            }
        }

        StringJoiner stringJoinerNotExist = new StringJoiner(" ");
        for (int i = 1; i < 10; i++) {
            if (!stringBuilderMiddle.toString().contains(String.valueOf(i)) && i != max && i != min) {
                stringJoinerNotExist.add(String.valueOf(i));
            }
        }

        System.out.println("1: " + count1 + ", 2: " + count2 + ", 3: " + count3 + ", 4: " + count4 + ", 5: " + count5
                + ", 6: " + count6 + ", 7: " + count7 + ", 8: " + count8 + ", 9: " + count9);
        System.out.println("Чаще: " + stringJoinerMax + ", отсутствует: " + stringJoinerNotExist
                + ", реже: " + stringJoinerMin);
    }
}
