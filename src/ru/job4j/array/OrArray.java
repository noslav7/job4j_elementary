package ru.job4j.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class  OrArray {

    public static int[] or(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length) {
        mergedArray[k] = left[i];
        k++;
        i++;
        }
        while (j < right.length) {
        mergedArray[k] = right[j];
        k++;
        j++;
        }
        Set setWithNoDuplicates = new HashSet<>();
        for (int m = 0; m < mergedArray.length; m++) {
        setWithNoDuplicates.add(mergedArray[m]);
        }
        Iterator it = setWithNoDuplicates.iterator();
        int[] mergedArrayWithNoDuplicates = new int[setWithNoDuplicates.size()];
        int n = 0;
        while (it.hasNext()) {
        mergedArrayWithNoDuplicates[n] = (int) it.next();
        n++;
        }
        return mergedArrayWithNoDuplicates;
    }
}

