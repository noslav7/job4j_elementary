package ru.job4j.array;

import java.util.ArrayList;
import java.util.Collections;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            Collections.swap(data, min, index);
        }
        return data;
    }
}
