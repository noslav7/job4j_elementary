package ru.job4j.array;

import java.util.StringJoiner;

public class Task73 {
    public static void array(int[] arr) {
        StringJoiner stringJoinerFirst = new StringJoiner(" ");
        StringJoiner stringJoinerSecond = new StringJoiner(" ");
        int left = 0;
        int right = arr.length - 1;
        if (arr.length % 2 != 0) {
            while (left < arr.length / 2 && right > arr.length / 2) {
                if (left % 2 == 0) {
                    stringJoinerFirst.add(String.valueOf(arr[left]));
                    stringJoinerFirst.add(String.valueOf(arr[right]));
                } else {
                    stringJoinerSecond.add(String.valueOf(arr[left]));
                    stringJoinerSecond.add(String.valueOf(arr[right]));
                }
                left++;
                right--;
            }
        } else {
            while (left <= arr.length / 2 && right >= arr.length / 2) {
                if (left % 2 == 0) {
                    stringJoinerFirst.add(String.valueOf(arr[left]));
                    stringJoinerFirst.add(String.valueOf(arr[right]));
                } else {
                    stringJoinerSecond.add(String.valueOf(arr[left]));
                    stringJoinerSecond.add(String.valueOf(arr[right]));
                }
                left++;
                right--;
            }
        }
        System.out.println(stringJoinerFirst);
        System.out.println(stringJoinerSecond);
        if (arr.length % 2 != 0) {
            System.out.println(arr[arr.length / 2]);
        }
    }
}
