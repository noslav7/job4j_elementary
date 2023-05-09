package ru.job4j.array;
import java.util.*;

public class SymmetricDiff {

    public static int[] diff(int[] left, int[] right) {
        if (left.length == 0) {
            return right;
        }
        if (right.length == 0) {
            return left;
        }
        if (Arrays.equals(left, right)) {
            return new int[0];
        }
        Set<Integer> diffSet = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                found = true;
                break;
                }
                if (!found) {
                    diffSet.add(left[i]);
            }
            }
        }
        boolean got = false;
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    got = true;
                    break;
                }
            }
            if (!got) {
                diffSet.add(right[i]);
            }
            got = false;
        }
        int[] result = new int[diffSet.size()];
        int count = 0;
        for (Integer cell : diffSet) {
            result[count++] = cell;
        }
        return result;
    }
}
