package ru.job4j.array;

import java.util.ArrayList;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        ArrayList<Integer> uneven = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) {
                uneven.add(data[i]);
            }
            }
        int[] unevenArray = new int[uneven.size()];
        for (int i = 0; i < uneven.size(); i++) {
            unevenArray[i] = uneven.get(i);
        }
        return unevenArray;
        }
    }