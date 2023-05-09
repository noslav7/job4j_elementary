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

        int[] counts = new int[] {0, count1, count2, count3, count4, count5, count6, count7, count8, count9};

        int maxCount = 0;
        int minCount = 10;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
            }
            if (counts[i] < minCount && counts[i] != 0) {
                minCount = counts[i];
            }
        }

        StringJoiner stringJoinerMax = new StringJoiner(" ");
        StringJoiner stringJoinerMin = new StringJoiner(" ");
        StringJoiner stringJoinerNotExist = new StringJoiner(" ");
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] == maxCount && maxCount != minCount) {
                stringJoinerMax.add(String.valueOf(i));
            } else if (counts[i] == minCount && maxCount != minCount) {
                stringJoinerMin.add(String.valueOf(i));
            } else if (counts[i] == 0){
                stringJoinerNotExist.add(String.valueOf(i));
            }
        }

        if (stringJoinerMax.toString().isEmpty()) {
            stringJoinerMax.add(String.valueOf(0));
        }

        if (stringJoinerMin.toString().isEmpty()) {
            stringJoinerMin.add(String.valueOf(0));
        }

        System.out.println("1: " + count1 + ", 2: " + count2 + ", 3: " + count3 + ", 4: " + count4 + ", 5: " + count5
                + ", 6: " + count6 + ", 7: " + count7 + ", 8: " + count8 + ", 9: " + count9);
        System.out.println("Чаще: " + stringJoinerMax + ", отсутствует: " + stringJoinerNotExist
                + ", реже: " + stringJoinerMin);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2};
        array(arr);
    }
}
