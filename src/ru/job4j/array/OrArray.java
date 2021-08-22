package ru.job4j.array;

public class  OrArray {

    public static int[] or(int[] left, int[] right) {
        int[] unionArray = new int[left.length + right.length];
        int k = 0;
        for (int cell : left) {
            unionArray[k++] = cell;
        }
        for (int cell : right) {
            unionArray[k++] = cell;
        }
        int len = unionArray.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (unionArray[i] == unionArray[j]) {
                    for (k = j; k < len - 1; k++) {
                        unionArray[k] = unionArray[k + 1];
                        --len;
                    }
                }
            }
        }
        int[] unitedShortArray = new int[len];
        for (int i = 0; i < unitedShortArray.length; i++) {
            unitedShortArray[i] = unionArray[i];
        }
        return unitedShortArray;
    }
}

